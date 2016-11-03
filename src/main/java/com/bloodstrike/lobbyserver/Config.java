package com.bloodstrike.lobbyserver;

import java.util.Properties;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Config {
    private static final Logger logger = LogManager.getLogger(Config.class);
    private static Config instance;
    
    private Properties props;

    private Config() {
        props = new Properties();
        try {
            props.load(Config.class.getResourceAsStream("/server.properties"));
        } catch (Exception e) {
            
            logger.error("Erro ao carregar as cofigurações", e);
        }
    }
    
    public static void loadConfig() {
        if (instance == null)
            instance = new Config();
    }
    
    public static String get(String name) {
        String value = instance.props.getProperty(name, null);
            
        if (value == null)
            logger.error(String.format("A configuração \"%s\" não foi encontrada no arquivo de configuração", name));
        
        return value;
    }
}
