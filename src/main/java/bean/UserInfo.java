package bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import flex.messaging.io.amf.ASObject;

@SuppressWarnings("serial")
public class UserInfo implements Serializable {
    private int userId;
    private int loginId; // 14
    private String username; // U10018957263
    private String changename = ""; // não é padrão
    private String playerName;
    private int characterId = 0;
    private int isadult = 1;
    private int accountTag = 0;
    private int roomChannleId = 0; // não é padrão
    private int roomId = -1; // não é padrão
    private int timer = 0; // não é padrão
    private int team = 0; // não é padrão
    private Boolean observerFlag; // não é padrão
    private Boolean inGameServer = false; // não é padrão
    private int readyGame = 0; // não é padrão
    private long regTime;
    private long loginTime;
    private int client;
    private String token; // "14-0e1fca8835dfc4d8fb59634993fa53df-0"
    private int lv = 1;
    private long exp = 0;
    private int gold = 0;
    private int gp = 30000;
    private int gift = 0;
    private int boomCnt = 1;
    private Vector<BagBean> bagBeanVec;
    private Map<Integer, Object> storageMap;
    private int selectedBagIndex = 0;
    private int avatarT = 1;
    private int avatarCT = 2;
    private int avatarSH = 0;
    private int defaultAvatar = 1; // uint
    private Boolean matched = false; // não é padrão
    private int onlineTime = 0; // uint
    private RankUserBean rankBean = null; // não é padrão
    private RaceBattleData raceBattleData = null; // não é padrão
    private Boolean historyReport = false; // não é padrão
    private long lastPayTime;
    private int tmpPayCount = 0; // uint
    private int firstPayPackFlag = 0; // uint
    private int userStayStep = 0;
    private FastSettingBean fastSettingBean;
    private String activityIds = "";
    private List<Object> closedActivityIdArr; // array de q?
    private int teamId = 0;
    private Map<String, StorageBean> missionProgressDic; // não é padrão
    private Boolean isSignInedToday = false;
    private int whiteCrystalNumCurrentDay = 0; // _whiteCrystalNumCurrentDay
    private SignInBean clientSignInBean; // não é padrão
    private ASObject installmentRefundMap;
    private String isp;
    private String remoteIp;
    private String missionIds;
    
    public static UserInfo getDemo() {
        
        UserInfo u = new UserInfo();
        u.setLoginId(14);
        u.setUserId(6701384);
        u.setUsername("U10018957263");
        u.isAdult(1);
        u.setAccountTag(0);
        u.setRegTime(1464785781218L);
        u.setLoginTime(1464785781220L);
        u.setClient(6701384);
        u.setToken("14-0e1fca8835dfc4d8fb59634993fa53df-0");
        u.setGift(0);
        u.setBoomCnt(1);
        //u.setBagBeanVec(BagBean.getDemo()); // 
        //u.setStorageMap(null);
        u.setAvatarT(1);
        u.setAvatarCT(2);
        u.setAvatarSH(0);
        u.setDefaultAvatar(1);
        u.setOnlineTime(0);
        //u.setRankBean(null); // RankUserBean.getDemo()
        u.setLastPayTime(0);
        u.setTmpPayCount(0);
        u.setFirstPayPackFlag(0);
        u.setUserStayStep(0);
        u.setFastSettingBean(FastSettingBean.getDemo()); // alterar
        u.setActivityIds("");
        //u.setClosedActivityIdArr(new Object[] {}); // alterar
        u.setTeamId(0); // 16039
        u.isSignInedToday(false);
        u.setWhiteCrystalNumCurrentDay(0);
        //u.setInstallmentRefundMap(InstallmentBean.getDemo());
        u.setIsp("");
        u.setRemoteIp("172.31.12.30");
        u.setMissionIds("");
        
        // Character
        u.setCharacterId(0);
        u.setPlayerName("");
        u.setLv(1);
        u.setExp(0);
        u.setGold(0);
        u.setGp(30000);
        
        return u;
    }
    
    

    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    public int getLoginId() {
        return loginId;
    }
    public void setLoginId(int loginId) {
        this.loginId = loginId;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getChangename() {
        return changename;
    }
    public void setChangename(String changename) {
        this.changename = changename;
    }

    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getCharacterId() {
        return characterId;
    }
    public void setCharacterId(int characterId) {
        this.characterId = characterId;
    }

    public int isAdult() {
        return isadult;
    }
    public void isAdult(int isadult) {
        this.isadult = isadult;
    }

    public int getAccountTag() {
        return accountTag;
    }
    public void setAccountTag(int accountTag) {
        this.accountTag = accountTag;
    }

    public int getRoomChannleId() {
        return roomChannleId;
    }
    public void setRoomChannleId(int roomChannleId) {
        this.roomChannleId = roomChannleId;
    }

    public int getRoomId() {
        return roomId;
    }
    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getTimer() {
        return timer;
    }
    public void setTimer(int timer) {
        this.timer = timer;
    }

    public int getTeam() {
        return team;
    }
    public void setTeam(int team) {
        this.team = team;
    }

    public Boolean getObserverFlag() {
        return observerFlag;
    }
    public void setObserverFlag(Boolean observerFlag) {
        this.observerFlag = observerFlag;
    }

    public Boolean inGameServer() {
        return inGameServer;
    }
    public void inGameServer(Boolean inGameServer) {
        this.inGameServer = inGameServer;
    }

    public int getReadyGame() {
        return readyGame;
    }
    public void setReadyGame(int readyGame) {
        this.readyGame = readyGame;
    }

    public long getRegTime() {
        return regTime;
    }
    public void setRegTime(long regTime) {
        this.regTime = regTime;
    }

    public long getLoginTime() {
        return loginTime;
    }
    public void setLoginTime(long loginTime) {
        this.loginTime = loginTime;
    }

    public int getClient() {
        return client;
    }
    public void setClient(int client) {
        this.client = client;
    }

    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
    }

    public int getLv() {
        return lv;
    }
    public void setLv(int lv) {
        this.lv = lv;
    }

    public long getExp() {
        return exp;
    }
    public void setExp(long exp) {
        this.exp = exp;
    }

    public int getGold() {
        return gold;
    }
    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getGp() {
        return gp;
    }
    public void setGp(int gp) {
        this.gp = gp;
    }

    public int getGift() {
        return gift;
    }
    public void setGift(int gift) {
        this.gift = gift;
    }

    public int getBoomCnt() {
        return boomCnt;
    }
    public void setBoomCnt(int boomCnt) {
        this.boomCnt = boomCnt;
    }

    public Vector<BagBean> getBagBeanVec() {
        return bagBeanVec;
    }
    public void setBagBeanVec(Vector<BagBean> bagBeanVec) {
        this.bagBeanVec = bagBeanVec;
    }

    public Map<Integer, Object> getStorageMap() {
        return storageMap;
    }
    public void setStorageMap(Map<Integer, Object> storageMap) {
        this.storageMap = storageMap;
    }

    public int getSelectedBagIndex() {
        return selectedBagIndex;
    }
    public void setSelectedBagIndex(int selectedBagIndex) {
        this.selectedBagIndex = selectedBagIndex;
    }

    public int getAvatarT() {
        return avatarT;
    }
    public void setAvatarT(int avatarT) {
        this.avatarT = avatarT;
    }

    public int getAvatarCT() {
        return avatarCT;
    }
    public void setAvatarCT(int avatarCT) {
        this.avatarCT = avatarCT;
    }

    public int getAvatarSH() {
        return avatarSH;
    }
    public void setAvatarSH(int avatarSH) {
        this.avatarSH = avatarSH;
    }

    public int getDefaultAvatar() {
        return defaultAvatar;
    }
    public void setDefaultAvatar(int defaultAvatar) {
        this.defaultAvatar = defaultAvatar;
    }

    public Boolean getMatched() {
        return matched;
    }
    public void setMatched(Boolean matched) {
        this.matched = matched;
    }

    public int getOnlineTime() {
        return onlineTime;
    }
    public void setOnlineTime(int onlineTime) {
        this.onlineTime = onlineTime;
    }

    public RankUserBean getRankBean() {
        return rankBean;
    }
    public void setRankBean(RankUserBean rankBean) {
        this.rankBean = rankBean;
    }

    public RaceBattleData getRaceBattleData() {
        return raceBattleData;
    }
    public void setRaceBattleData(RaceBattleData raceBattleData) {
        this.raceBattleData = raceBattleData;
    }

    public Boolean getHistoryReport() {
        return historyReport;
    }
    public void setHistoryReport(Boolean historyReport) {
        this.historyReport = historyReport;
    }

    public long getLastPayTime() {
        return lastPayTime;
    }
    public void setLastPayTime(long lastPayTime) {
        this.lastPayTime = lastPayTime;
    }

    public int getTmpPayCount() {
        return tmpPayCount;
    }
    public void setTmpPayCount(int tmpPayCount) {
        this.tmpPayCount = tmpPayCount;
    }

    public int getFirstPayPackFlag() {
        return firstPayPackFlag;
    }
    public void setFirstPayPackFlag(int firstPayPackFlag) {
        this.firstPayPackFlag = firstPayPackFlag;
    }

    public int getUserStayStep() {
        return userStayStep;
    }
    public void setUserStayStep(int userStayStep) {
        this.userStayStep = userStayStep;
    }

    public FastSettingBean getFastSettingBean() {
        return fastSettingBean;
    }
    public void setFastSettingBean(FastSettingBean fastSettingBean) {
        this.fastSettingBean = fastSettingBean;
    }

    public String getActivityIds() {
        return activityIds;
    }
    public void setActivityIds(String activityIds) {
        this.activityIds = activityIds;
    }

    public List<Object> getClosedActivityIdArr() {
        return closedActivityIdArr;
    }
    public void setClosedActivityIdArr(List<Object> closedActivityIdArr) {
        this.closedActivityIdArr = closedActivityIdArr;
    }

    public int getTeamId() {
        return teamId;
    }
    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public Map<String, StorageBean> getMissionProgressDic() {
        return missionProgressDic;
    }
    public void setMissionProgressDic(Map<String, StorageBean> missionProgressDic) {
        this.missionProgressDic = missionProgressDic;
    }

    public Boolean isSignInedToday() {
        return isSignInedToday;
    }
    public void isSignInedToday(Boolean isSignInedToday) {
        this.isSignInedToday = isSignInedToday;
    }

    public int getWhiteCrystalNumCurrentDay() {
        return whiteCrystalNumCurrentDay;
    }
    public void setWhiteCrystalNumCurrentDay(int whiteCrystalNumCurrentDay) {
        this.whiteCrystalNumCurrentDay = whiteCrystalNumCurrentDay;
    }

    public SignInBean getClientSignInBean() {
        return clientSignInBean;
    }
    public void setClientSignInBean(SignInBean clientSignInBean) {
        this.clientSignInBean = clientSignInBean;
    }

    public ASObject getInstallmentRefundMap() {
        return installmentRefundMap;
    }
    public void setInstallmentRefundMap(ASObject installmentRefundMap) {
        this.installmentRefundMap = installmentRefundMap;
    }

    public String getIsp() {
        return isp;
    }
    public void setIsp(String isp) {
        this.isp = isp;
    }

    public String getRemoteIp() {
        return remoteIp;
    }
    public void setRemoteIp(String remoteIp) {
        this.remoteIp = remoteIp;
    }

    public String getMissionIds() {
        return missionIds;
    }
    public void setMissionIds(String missionIds) {
        this.missionIds = missionIds;
    }

    @Override
    public String toString() {
        return "UserInfo [userId=" + userId + ", loginId=" + loginId + ", username=" + username + ", changename="
                + changename + ", playerName=" + playerName + ", characterId=" + characterId + ", isadult=" + isadult
                + ", accountTag=" + accountTag + ", roomChannleId=" + roomChannleId + ", roomId=" + roomId + ", timer="
                + timer + ", team=" + team + ", observerFlag=" + observerFlag + ", inGameServer=" + inGameServer
                + ", readyGame=" + readyGame + ", regTime=" + regTime + ", loginTime=" + loginTime + ", client="
                + client + ", token=" + token + ", lv=" + lv + ", exp=" + exp + ", gold=" + gold + ", gp=" + gp
                + ", gift=" + gift + ", boomCnt=" + boomCnt + ", selectedBagIndex=" + selectedBagIndex + ", avatarT="
                + avatarT + ", avatarCT=" + avatarCT + ", avatarSH=" + avatarSH + ", defaultAvatar=" + defaultAvatar
                + ", matched=" + matched + ", onlineTime=" + onlineTime + ", historyReport=" + historyReport
                + ", lastPayTime=" + lastPayTime + ", tmpPayCount=" + tmpPayCount + ", firstPayPackFlag="
                + firstPayPackFlag + ", userStayStep=" + userStayStep + ", activityIds=" + activityIds + ", teamId="
                + teamId + ", isSignInedToday=" + isSignInedToday + ", whiteCrystalNumCurrentDay="
                + whiteCrystalNumCurrentDay + ", clientSignInBean=" + clientSignInBean + ", isp=" + isp + ", remoteIp="
                + remoteIp + ", missionIds=" + missionIds + "]";
    }
}
