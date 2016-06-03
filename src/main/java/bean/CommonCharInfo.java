package bean;

import java.io.Serializable;
import java.util.Calendar;

@SuppressWarnings("serial")
public class CommonCharInfo implements Serializable {
    public Boolean isOnline = false;
    public String teamName = "";
    public int notReadChatNum = 0;
    public String characterName;
    public Boolean inGameServer = false;
    public int lv = 1;
    public Calendar logoutTime;
    public Calendar dateline;
    public long characterId = 0;
    public int teamId = 0;
    public long globalCharId = 0;
    public int onlineIndex = 0;
    public Boolean myself = false;
    public int socialRelationshipType = 0;
    public Boolean couldInvite = false;
    public int teamJobFlag;
    public int type = 0;
    
    public static CommonCharInfo[] getDemoOffline() {
        Calendar dateline1 = Calendar.getInstance();
        dateline1.setTimeInMillis(1459178175043L);
        
        Calendar logoutTime1 = Calendar.getInstance();
        logoutTime1.setTimeInMillis(1463589398023L);
        
        CommonCharInfo c1 = new CommonCharInfo();
        c1.setCharacterId(409821);
        c1.setCharacterName("w2eduardo");
        c1.setDateline(dateline1);
        c1.inGameServer(false);
        c1.isOnline(false);
        c1.setLogoutTime(logoutTime1);
        c1.setLv(47);
        c1.setNotReadChatNum(0);
        c1.setTeamId(17476);
        c1.setTeamName("FPS[4]FasT");
        c1.setGlobalCharId(0);
        c1.setOnlineIndex(0);
        c1.isMySelf(false);
        c1.setSocialRelationshipType(0);
        c1.setCouldInvite(false);
        c1.setTeamJobFlag(0);
        c1.setType(0);

        Calendar dateline2 = Calendar.getInstance();
        dateline2.setTimeInMillis(1462470077294L);
        
        Calendar logoutTime2 = Calendar.getInstance();
        logoutTime2.setTimeInMillis(1459439449467L);
        
        CommonCharInfo c2 = new CommonCharInfo();
        c2.setCharacterId(560186);
        c2.setCharacterName("jonas591");
        c2.setDateline(dateline2);
        c2.inGameServer(false);
        c2.isOnline(false);
        c2.setLogoutTime(logoutTime2);
        c2.setLv(27);
        c2.setNotReadChatNum(0);
        c2.setTeamId(2435);
        c2.setTeamName("gtking");
        c2.setGlobalCharId(0);
        c2.setOnlineIndex(0);
        c2.isMySelf(false);
        c2.setSocialRelationshipType(0);
        c2.setCouldInvite(false);
        c2.setTeamJobFlag(0);
        c2.setType(0);
        
        return new CommonCharInfo[] {c1, c2};
    }

    public static CommonCharInfo[] getDemoOnline() {
        Calendar dateline = Calendar.getInstance();
        dateline.setTimeInMillis(1459270230266L);
        
        Calendar logoutTime = Calendar.getInstance();
        logoutTime.setTimeInMillis(0);
        
        CommonCharInfo c = new CommonCharInfo();
        c.setCharacterId(2702539);
        c.setCharacterName("believe_cazy");
        c.setDateline(dateline);
        c.inGameServer(false);
        c.isOnline(true);
        c.setLogoutTime(logoutTime);
        c.setLv(30);
        c.setNotReadChatNum(0);
        c.setTeamId(0);
        c.setTeamName("");
        c.setGlobalCharId(0);
        c.setOnlineIndex(0);
        c.isMySelf(false);
        c.setSocialRelationshipType(0);
        c.setCouldInvite(false);
        c.setTeamJobFlag(0);
        c.setType(0);
        
        return new CommonCharInfo[] {c};
    }
    
    public long getCharacterId() {
        return characterId;
    }
    public void setCharacterId(long characterId) {
        this.characterId = characterId;
    }

    public String getCharacterName() {
        return characterName;
    }
    public void setCharacterName(String characterName) {
        this.characterName = characterName;
    }
    public int getLv() {
        return lv;
    }
    public void setLv(int lv) {
        this.lv = lv;
    }
    public int getTeamId() {
        return teamId;
    }
    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public Boolean isOnline() {
        return isOnline;
    }
    public void isOnline(Boolean isOnline) {
        this.isOnline = isOnline;
    }
    public Calendar getLogoutTime() {
        return logoutTime;
    }
    public void setLogoutTime(Calendar logoutTime) {
        this.logoutTime = logoutTime;
    }
    public Boolean inGameServer() {
        return inGameServer;
    }
    public void inGameServer(Boolean inGameServer) {
        this.inGameServer = inGameServer;
    }
    public Calendar getDateline() {
        return dateline;
    }
    public void setDateline(Calendar dateline) {
        this.dateline = dateline;
    }
    public int getNotReadChatNum() {
        return notReadChatNum;
    }
    public void setNotReadChatNum(int notReadChatNum) {
        this.notReadChatNum = notReadChatNum;
    }
    public long getGlobalCharId() {
        return globalCharId;
    }
    public void setGlobalCharId(long globalCharId) {
        this.globalCharId = globalCharId;
    }
    public int getOnlineIndex() {
        return onlineIndex;
    }
    public void setOnlineIndex(int onlineIndex) {
        this.onlineIndex = onlineIndex;
    }
    public Boolean isMySelf() {
        return myself;
    }
    public void isMySelf(Boolean myself) {
        this.myself = myself;
    }
    public int getSocialRelationshipType() {
        return socialRelationshipType;
    }
    public void setSocialRelationshipType(int socialRelationshipType) {
        this.socialRelationshipType = socialRelationshipType;
    }
    public Boolean getCouldInvite() {
        return couldInvite;
    }
    public void setCouldInvite(Boolean couldInvite) {
        this.couldInvite = couldInvite;
    }
    public int getTeamJobFlag() {
        return teamJobFlag;
    }
    public void setTeamJobFlag(int teamJobFlag) {
        this.teamJobFlag = teamJobFlag;
    }
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "CommonCharInfo [isOnline=" + isOnline + ", teamName=" + teamName + ", notReadChatNum=" + notReadChatNum
                + ", characterName=" + characterName + ", inGameServer=" + inGameServer + ", lv=" + lv + ", logoutTime="
                + logoutTime.getTimeInMillis() + ", dateline=" + dateline.getTimeInMillis() + ", characterId=" + characterId + ", teamId=" + teamId
                + ", globalCharId=" + globalCharId + ", onlineIndex=" + onlineIndex + ", myself=" + myself
                + ", socialRelationshipType=" + socialRelationshipType + ", couldInvite=" + couldInvite
                + ", teamJobFlag=" + teamJobFlag + ", type=" + type + "]";
    }
}