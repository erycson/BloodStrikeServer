package com.bloodstrike.lobbyserver;

import org.apache.logging.log4j.Logger;

import java.io.FileOutputStream;

import org.apache.logging.log4j.LogManager;

import com.bloodstrike.lobbyserver.manager.NetworkManager;

import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.net.NetClient;
import io.vertx.core.net.NetServer;
import io.vertx.core.net.NetSocket;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    
    public static void main(String[] args) throws Throwable {
        logger.info("===============================================================================");
        logger.info("BloodStrike Lobby Server");
        logger.info("Créditos: ExtremsX");
        logger.info("Versão: 0.1 Beta");
        logger.info("===============================================================================");

        logger.info("Carregando Configurações");
        Config.loadConfig();
        
        logger.info("Iniciando NetworkManager");
        NetworkManager.getInstance();
        
        if (Config.get("client.debug").equals("true")) {
            Vertx.vertx().setTimer(1000, id -> {
                try {
                    logger.info("Iniciando DUMPER");
                    startClientDebug();
                } catch (Exception e) { 
                    logger.error("Erro ao iniciar o DUMPER", e);
                }
            });
        }

        logger.info("Iniciando NetworkServer");
        NetworkServer.getInstance();
    }

    private static void startClientDebug() throws Exception {
        Logger log = LogManager.getLogger(Main.class);
        int port = Integer.parseInt(Config.get("network.port"));
        String host = Config.get("network.host");
        FileOutputStream fos = new FileOutputStream("./network.dump");
        
        NetServer server = Vertx.vertx().createNetServer();
        server.connectHandler(handler -> {
            NetClient client = Vertx.vertx().createNetClient();
            log.error("Nova conexão recebida de " + handler.remoteAddress());
            
            client.connect(port, host, res -> {
                if (!res.succeeded()) {
                    log.error("Erro ao se conectar ao servidor", res.cause());
                    try { fos.close(); } catch (Exception e) { }
                    return;
                }
                log.error("Erro ao se conectar ao servidor", res.cause());
                
                NetSocket socket = res.result();
                // Do cliente para o servidor
                handler.handler(buffer -> {
                    try { 
                        fos.write("\n\nClient -> Servidor\n".getBytes()); 
                        fos.write(buffer.getBytes());
                    } catch (Exception e) { }
                    socket.write(buffer);
                });
                
                // Do servidor para o cliente
                socket.handler(buffer -> {
                    try { 
                        fos.write("\n\nServidor -> Client\n".getBytes());
                        fos.write(buffer.getBytes());
                    } catch (Exception e) { }
                    handler.write(buffer);
                });
            });
        });
        server.listen(3999, res -> {
            if (!res.succeeded())
                return;
            log.info("Servidor DUMPER iniciado na porta 3999");
        });
    }
}
