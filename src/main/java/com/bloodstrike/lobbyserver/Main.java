package com.bloodstrike.lobbyserver;

import org.apache.log4j.Logger;

import com.bloodstrike.lobbyserver.manager.NetworkManager;

public class Main {
    final static Logger Log = Logger.getLogger(Main.class);
    
    public static void main(String[] args) throws Exception {
        Log.info("===============================================================================");
        Log.info("BloodStrike Lobby Server");
        Log.info("Créditos: ExtremsX");
        Log.info("Versão: 0.1 Beta");
        Log.info("===============================================================================");

        Log.info("Carregando Configurações");
        Config.getInstance();
        
        Log.info("Iniciando NetworkManager");
        NetworkManager.getInstance();
        
        Log.info("Iniciando NetworkServer");
        NetworkServer.getInstance();
    }
}
