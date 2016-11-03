package com.bloodstrike.lobbyserver.packet.client;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import com.bloodstrike.lobbyserver.ConnetionHandler;
import com.bloodstrike.lobbyserver.packet.Packet;
import com.bloodstrike.lobbyserver.packet.server.PROTOCOL_BASE_LOGIN_ACK;

import bean.UserInfo;
import common.net.APC;

public class PROTOCOL_BASE_LOGIN_REQ extends Packet {

    public PROTOCOL_BASE_LOGIN_REQ(ConnetionHandler session, Object[] params) {
        super(session, params);
    }

    @Override
    public void run() {
        APC apc = new APC("callBackLoginFail");

        // Verifica a quantidade de parametros recebido
        if (params.length != 7)  {
            session.send(new PROTOCOL_BASE_LOGIN_ACK(-4));
            session.close();
            return;
        }
        
        String username = params[1].toString();
        int timestamp   = Integer.parseInt(params[3].toString());
        int isAdult     = (Integer) params[2];
        String sign     = params[4].toString();
        String ip       = params[6].toString();
        
        UserInfo userInfo = UserInfo.getDemo(); // daoUserInfo.findByUsername(username);
        // Erro generico
        if (userInfo == null) {
            session.send(new PROTOCOL_BASE_LOGIN_ACK(-4));
            session.close();
        }
        /*
        // Assinatura incorreta
        else if (!userInfo.getSign().equals(sign)) {
            apc.addParameter(
            session.send(new PROTOCOL_BASE_LOGIN_ACK(-9));
            session.close();
        }
        // Não é um adulto??
        else if (isAdult != 1) {
            apc.addParameter(
            session.send(new PROTOCOL_BASE_LOGIN_ACK(-10));
            session.close();
        }
        // Timestamp incorreto ou fora da valudade
        else if (userInfo.getTimestamp() != timestamp) {
            apc.addParameter(
            session.send(new PROTOCOL_BASE_LOGIN_ACK(-11));
            session.close();
        }
        // Conta banida
        else if (userInfo.isBanned()) {
            apc.addParameter(
            session.send(new PROTOCOL_BASE_LOGIN_ACK(-7));
            session.close();
        }
        // Já está logado
        else if (userInfo.inGameServer()) {
            apc.addParameter(
            session.send(new PROTOCOL_BASE_LOGIN_ACK(-8));
            session.close();
        }
        */
        // Login realizado com sucesso
        else {
            apc.setFunctionName("callBackLoginSuccess");
            apc.addParameter(new PROTOCOL_BASE_LOGIN_ACK(userInfo));
            //session.send(apc);

            try {
                byte[] data = Files.readAllBytes(new File("D:\\callBackLoginSuccess2.dump").toPath());
                System.out.println("Enviando: " + data.length);
                session.send(data);
            } catch (IOException e) {
                e.printStackTrace();
            }
            
        }
    }

}
