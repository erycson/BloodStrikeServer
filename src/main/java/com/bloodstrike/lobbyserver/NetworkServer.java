package com.bloodstrike.lobbyserver;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.net.NetServer;
import io.vertx.core.net.NetSocket;

import com.bloodstrike.lobbyserver.manager.NetworkManager;

public class NetworkServer implements Handler<NetSocket> {
    private static final Logger logger = LogManager.getLogger(NetworkServer.class);
    
    private static NetworkServer instance;
    private NetworkManager manager;
    
    public static NetworkServer getInstance() {
        if (instance == null)
            instance = new NetworkServer();
        return instance;
    }
    
    private NetworkServer() {
        int port = Integer.parseInt(Config.get("network.port"));
        String host = Config.get("network.host");
        
        manager = NetworkManager.getInstance();
        
        Vertx vertx = Vertx.vertx();
        NetServer server = vertx.createNetServer();
        server.connectHandler(this);
        server.listen(port, host, res -> {
            if (res.succeeded()) {
                logger.info(String.format("Servidor iniciado, aguardando conexões a partir de %s:%d", host, port));
            } else {
                logger.error(String.format("Não foi possivel iniciar o servidor em %s:%d", host, port), res.cause());
            }
        });
    }

    public void handle(NetSocket socket) {
        logger.debug("Nova conexão recebida a partir de " + socket.remoteAddress());
        manager.addClient(socket);
    }
}
