package com.bloodstrike.lobbyserver;

import java.util.Properties;

import org.apache.log4j.Logger;

public class Config {
    final static Logger Log = Logger.getLogger(NetworkServer.class);
    private static Config instance;
    
    public static String HOST = "127.0.0.1";
    public static int PORT = 4000;

    private Config() {
        Properties props = new Properties();
        try {
            props.load(Config.class.getResourceAsStream("/server.properties"));
        } catch (Exception e) {
            Log.error("Erro ao carregar as cofigurações", e);
            return;
        }
        
        HOST = props.getProperty("network.host");
        PORT = Integer.parseInt(props.getProperty("network.port"));
    }
    
    public static Config getInstance() {
        if (instance == null)
            instance = new Config();
        return instance;
    }
}
