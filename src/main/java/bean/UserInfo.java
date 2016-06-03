package bean;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name="users")
public class UserInfo implements Serializable {
    @Id
    @GeneratedValue
    private int userId;
    private int loginId; // 14
    private String username; // U10018957263
    //private String changename;
    private String playerName;
    private int characterId = 0;
    private int isadult = 1;
    private int accountTag = 0;
    //private int roomChannleId;
    //private int roomId;
    //private int timer;
    //private int team;
    //private Boolean observerFlag;
    //private Boolean inGameServer;
    //private int readyGame;
    private Calendar regTime;
    private Calendar loginTime;
    private int client;
    private String token; // "14-0e1fca8835dfc4d8fb59634993fa53df-0"
    private int lv = 1;
    private long exp = 0;
    private int gold = 0;
    private int gp = 30000;
    private int gift = 0;
    private int boomCnt = 1;
    private Map<Integer, BagBean> bagBeanVec;
    private Map<String, StorageBean> storageMap;
    //private int selectedBagIndex;
    private int avatarT = 1;
    private int avatarCT = 2;
    private int avatarSH = 0;
    private int defaultAvatar = 1; // uint
    //private Boolean matched = false;
    private int onlineTime = 0; // uint
    private RankUserBean rankBean;
    //private RaceBattleData raceBattleData;
    //private Boolean historyReport = false;
    private Calendar lastPayTime;
    private int tmpPayCount = 0; // uint
    private int firstPayPackFlag = 0; // uint
    private int userStayStep = 0;
    private FastSettingBean fastSettingBean;
    private String activityIds = "";
    private Object[] closedActivityIdArr; // array de q?
    private int teamId = 0;
    //private Map<String, StorageBean> missionProgressDic;
    private Boolean isSignInedToday = false;
    private int whiteCrystalNumCurrentDay = 0; // _whiteCrystalNumCurrentDay
    //private SignInBean clientSignInBean;
    private Map<String, InstallmentBean> installmentRefundMap;
    private String isp;
    private String remoteIp;
    private String missionIds;
    
    public static UserInfo getDemo() {
        Calendar regTime = Calendar.getInstance();
        regTime.setTimeInMillis(1464785781218L);
        
        Calendar loginTime = Calendar.getInstance();
        loginTime.setTimeInMillis(1464785781220L);
        
        Calendar lastPayTime = Calendar.getInstance();
        lastPayTime.setTimeInMillis(0);
        
        UserInfo u = new UserInfo();
        u.setLoginId(14);
        u.setUserId(6701384);
        u.setUsername("U10018957263");
        u.isAdult(1);
        u.setAccountTag(0);
        u.setRegTime(regTime);
        u.setLoginTime(loginTime);
        u.setClient(6701384);
        u.setToken("14-0e1fca8835dfc4d8fb59634993fa53df-0");
        u.setGift(1);
        u.setBoomCnt(1);
        u.setBagBeanVec(null); // BagBean.getDemo()
        u.setStorageMap(null);
        u.setAvatarT(1);
        u.setAvatarCT(2);
        u.setAvatarSH(0);
        u.setDefaultAvatar(1);
        u.setOnlineTime(0);
        u.setRankBean(null); // RankUserBean.getDemo()
        u.setLastPayTime(lastPayTime);
        u.setTmpPayCount(0);
        u.setFirstPayPackFlag(0);
        u.setUserStayStep(0);
        u.setFastSettingBean(FastSettingBean.getDemo()); // alterar
        u.setActivityIds("");
        u.setClosedActivityIdArr(new Object[] {}); // alterar
        u.setTeamId(0); // 16039
        u.setInstallmentRefundMap(new HashMap<String, InstallmentBean>()); //InstallmentBean.getDemo()
        u.setIsp("");
        u.setRemoteIp("");
        
        // Character
        u.setCharacterId(0);
        u.setPlayerName("");
        u.setLv(1);
        u.setExp(0);
        u.setGold(0);
        u.setGp(30000);
        
        return u;
    }

    public int getLoginId() {
        return loginId;
    }

    public void setLoginId(int loginId) {
        this.loginId = loginId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public Calendar getRegTime() {
        return regTime;
    }

    public void setRegTime(Calendar regTime) {
        this.regTime = regTime;
    }

    public Calendar getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Calendar loginTime) {
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

    public Map<Integer, BagBean> getBagBeanVec() {
        return bagBeanVec;
    }

    public void setBagBeanVec(Map<Integer, BagBean> bagBeanVec) {
        this.bagBeanVec = bagBeanVec;
    }

    public Map<String, StorageBean> getStorageMap() {
        return storageMap;
    }

    public void setStorageMap(Map<String, StorageBean> storageMap) {
        this.storageMap = storageMap;
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

    public Calendar getLastPayTime() {
        return lastPayTime;
    }

    public void setLastPayTime(Calendar lastPayTime) {
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

    public Object[] getClosedActivityIdArr() {
        return closedActivityIdArr;
    }

    public void setClosedActivityIdArr(Object[] closedActivityIdArr) {
        this.closedActivityIdArr = closedActivityIdArr;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public Boolean getIsSignInedToday() {
        return isSignInedToday;
    }

    public void setIsSignInedToday(Boolean isSignInedToday) {
        this.isSignInedToday = isSignInedToday;
    }

    public int getWhiteCrystalNumCurrentDay() {
        return whiteCrystalNumCurrentDay;
    }

    public void setWhiteCrystalNumCurrentDay(int whiteCrystalNumCurrentDay) {
        this.whiteCrystalNumCurrentDay = whiteCrystalNumCurrentDay;
    }

    public Map<String, InstallmentBean> getInstallmentRefundMap() {
        return installmentRefundMap;
    }

    public void setInstallmentRefundMap(Map<String, InstallmentBean> installmentRefundMap) {
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
        return "UserInfo [loginId=" + loginId + ", userId=" + userId + ", username=" + username + ", playerName="
                + playerName + ", characterId=" + characterId + ", isadult=" + isadult + ", accountTag=" + accountTag
                + ", regTime=" + regTime.getTimeInMillis() + ", loginTime=" + loginTime.getTimeInMillis() + ", client=" + client + ", token=" + token
                + ", lv=" + lv + ", exp=" + exp + ", gold=" + gold + ", gp=" + gp + ", gift=" + gift + ", boomCnt="
                + boomCnt + ", bagBeanVec=" + bagBeanVec + ", storageMap=" + storageMap + ", avatarT=" + avatarT
                + ", avatarCT=" + avatarCT + ", avatarSH=" + avatarSH + ", defaultAvatar=" + defaultAvatar
                + ", onlineTime=" + onlineTime + ", rankBean=" + rankBean + ", lastPayTime=" + lastPayTime.getTimeInMillis()
                + ", tmpPayCount=" + tmpPayCount + ", firstPayPackFlag=" + firstPayPackFlag + ", userStayStep="
                + userStayStep + ", fastSettingBean=" + fastSettingBean + ", activityIds=" + activityIds
                + ", closedActivityIdArr=" + Arrays.toString(closedActivityIdArr) + ", teamId=" + teamId
                + ", isSignInedToday=" + isSignInedToday + ", whiteCrystalNumCurrentDay=" + whiteCrystalNumCurrentDay
                + ", installmentRefundMap=" + installmentRefundMap + ", isp=" + isp + ", remoteIp=" + remoteIp
                + ", missionIds=" + missionIds + "]";
    }
    
}
