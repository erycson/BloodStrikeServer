package bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class ChannelInfo implements Serializable {
    public int id = 0;
    public String name = "";
    public String ip = "";
    public String serverDomain = "";
    public int port = 0;
    public int number = 0;
    public int maxClient = 0;
    public int limitMinLV = 0;
    public int limitMaxLV = 0;
    public Boolean moreServerFlag = false;
    public int position = 0;
    public Boolean promiseToFightFlag = false;
    public Object maxRoom;
    public Object session;
    public int allowedRoomTypeId = 1;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getIp() {
        return ip;
    }
    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getServerDomain() {
        return serverDomain;
    }
    public void setServerDomain(String serverDomain) {
        this.serverDomain = serverDomain;
    }
    public int getPort() {
        return port;
    }
    public void setPort(int port) {
        this.port = port;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public int getMaxClient() {
        return maxClient;
    }
    public void setMaxClient(int maxClient) {
        this.maxClient = maxClient;
    }
    public int getLimitMinLV() {
        return limitMinLV;
    }
    public void setLimitMinLV(int limitMinLV) {
        this.limitMinLV = limitMinLV;
    }
    public int getLimitMaxLV() {
        return limitMaxLV;
    }
    public void setLimitMaxLV(int limitMaxLV) {
        this.limitMaxLV = limitMaxLV;
    }
    public Boolean getMoreServerFlag() {
        return moreServerFlag;
    }
    public void setMoreServerFlag(Boolean moreServerFlag) {
        this.moreServerFlag = moreServerFlag;
    }
    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }
    public Boolean getPromiseToFightFlag() {
        return promiseToFightFlag;
    }
    public void setPromiseToFightFlag(Boolean promiseToFightFlag) {
        this.promiseToFightFlag = promiseToFightFlag;
    }
    public Object getMaxRoom() {
        return maxRoom;
    }
    public void setMaxRoom(Object maxRoom) {
        this.maxRoom = maxRoom;
    }
    public Object getSession() {
        return session;
    }
    public void setSession(Object session) {
        this.session = session;
    }
    public int getAllowedRoomTypeId() {
        return allowedRoomTypeId;
    }
    public void setAllowedRoomTypeId(int allowedRoomTypeId) {
        this.allowedRoomTypeId = allowedRoomTypeId;
    }
    
    @Override
    public String toString() {
        return "ChannelInfo [id=" + id + ", name=" + name + ", ip=" + ip + ", serverDomain=" + serverDomain + ", port="
                + port + ", number=" + number + ", maxClient=" + maxClient + ", limitMinLV=" + limitMinLV
                + ", limitMaxLV=" + limitMaxLV + ", moreServerFlag=" + moreServerFlag + ", position=" + position
                + ", promiseToFightFlag=" + promiseToFightFlag + ", maxRoom=" + maxRoom + ", session=" + session
                + ", allowedRoomTypeId=" + allowedRoomTypeId + "]";
    }
}
