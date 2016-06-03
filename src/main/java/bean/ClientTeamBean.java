package bean;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.*;

@Entity
@Table(name="teams")
@SuppressWarnings("serial")
public class ClientTeamBean implements Serializable {
    @Id
    @GeneratedValue
    @Column(name="team_id") 
    public int teamId = 0;
    
    @Column(name="name") 
    public String name = "";
    
    @Column(name="create_char_id") 
    public int createCharId = 0;
    
    @Column(name="leader_char_id") 
    public int leaderCharId = 0;
    
    @Column(name="leader_name") 
    public String leaderName = "";
    
    @Column(name="m_number") 
    public int mNumber = 0;
    
    @Column(name="m_number_limit") 
    public int mNumberLimit = 0;
    
    @Column(name="team_exp") 
    public int teamExp = 0;
    
    @Column(name="team_lv") 
    public int teamLv = 0;
    
    @Column(name="declaration") 
    public String declaration = "";
    
    @Column(name="notice") 
    public String notice = "";
    
    @Column(name="dateline") 
    public Calendar dateline;
    
    @Column(name="homepage") 
    public String homepage = "";
    
    @Column(name="qq") 
    public String qq = "";
    
    @Column(name="yy") 
    public String yy = "";
    
    @Column(name="rank") 
    public int rank = 0;
    
    @Column(name="is_apply") 
    public Boolean isApply;
    
    @Column(name="battle_end_num") 
    public int battleEndNum = 0;
    
    @Column(name="win_num") 
    public int winNum = 0;
    
    @Column(name="fail_num") 
    public int failNum = 0;

    public static ClientTeamBean getDemo() {
        Calendar dateline = Calendar.getInstance();
        dateline.setTimeInMillis(1453233384327L);
        
        ClientTeamBean t = new ClientTeamBean();
        t.setBattleEndNum(213);
        t.setCreateCharId(3676148);
        t.setDateline(dateline);
        t.setDeclaration("subindo na velocidade do tempo procurando pessoas [{ON}] -------->>>>Rc : 12595691 <<<<-----  Nivel [{25}] pra cima ok");
        t.setFailNum(167);
        t.setHomepage("https://www.facebook.com/Blood-strick-cla-OsPro-451214078401391/?skip_nax_wizard=true#");
        t.isApply(false);
        t.setLeaderCharId(4015753);
        t.setLeaderName("Rena*Ally");
        t.setMembersNumber(427);
        t.setMembersNumberLimit(500);
        t.setName("{[OsPro]}");
        t.setNotice("Clã [{OsPros}]");
        t.setQQ("RC: 1546124 skype :GGG1 grupo no wats ad la 27997558075");
        t.setRank(83);
        t.setTeamExp(478483);
        t.setTeamId(16039);
        t.setTeamLv(3);
        t.setWinNum(41);
        t.setYY("Canal do yotube : https://www.youtube.com/channel/UCrxhJokgJzsdAaPVn0hlulg");
        
        return t;
    }
    
    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCreateCharId() {
        return createCharId;
    }

    public void setCreateCharId(int createCharId) {
        this.createCharId = createCharId;
    }

    public int getLeaderCharId() {
        return leaderCharId;
    }

    public void setLeaderCharId(int leaderCharId) {
        this.leaderCharId = leaderCharId;
    }

    public String getLeaderName() {
        return leaderName;
    }

    public void setLeaderName(String leaderName) {
        this.leaderName = leaderName;
    }

    public int getMembersNumber() {
        return mNumber;
    }

    public void setMembersNumber(int mNumber) {
        this.mNumber = mNumber;
    }

    public int getMembersNumberLimit() {
        return mNumberLimit;
    }

    public void setMembersNumberLimit(int mNumberLimit) {
        this.mNumberLimit = mNumberLimit;
    }

    public int getTeamExp() {
        return teamExp;
    }

    public void setTeamExp(int teamExp) {
        this.teamExp = teamExp;
    }

    public int getTeamLv() {
        return teamLv;
    }

    public void setTeamLv(int teamLv) {
        this.teamLv = teamLv;
    }

    public String getDeclaration() {
        return declaration;
    }

    public void setDeclaration(String declaration) {
        this.declaration = declaration;
    }

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public Calendar getDateline() {
        return dateline;
    }

    public void setDateline(Calendar dateline) {
        this.dateline = dateline;
    }

    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public String getQQ() {
        return qq;
    }

    public void setQQ(String qq) {
        this.qq = qq;
    }

    public String getYY() {
        return yy;
    }

    public void setYY(String yy) {
        this.yy = yy;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public Boolean isApply() {
        return isApply;
    }

    public void isApply(Boolean isApply) {
        this.isApply = isApply;
    }

    public int getBattleEndNum() {
        return battleEndNum;
    }

    public void setBattleEndNum(int battleEndNum) {
        this.battleEndNum = battleEndNum;
    }

    public int getWinNum() {
        return winNum;
    }

    public void setWinNum(int winNum) {
        this.winNum = winNum;
    }

    public int getFailNum() {
        return failNum;
    }

    public void setFailNum(int failNum) {
        this.failNum = failNum;
    }

    @Override
    public String toString() {
        return "ClientTeamBean [teamId=" + teamId + ", name=" + name + ", createCharId=" + createCharId
                + ", leaderCharId=" + leaderCharId + ", leaderName=" + leaderName + ", mNumber=" + mNumber
                + ", mNumberLimit=" + mNumberLimit + ", teamExp=" + teamExp + ", teamLv=" + teamLv + ", declaration="
                + declaration + ", notice=" + notice + ", dateline=" + dateline.getTime() + ", homepage=" + homepage + ", qq="
                + qq + ", yy=" + yy + ", rank=" + rank + ", isApply=" + isApply + ", battleEndNum=" + battleEndNum
                + ", winNum=" + winNum + ", failNum=" + failNum + "]";
    }
    
}
