package bean;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teams")
@SuppressWarnings("serial")
public class ClientTeamUserBean implements Serializable {
    @Id
    @GeneratedValue
    @Column(name="id") 
    public int id = 0;
    
    @Column(name="team_id") 
    public int teamId = 0;
    
    @Column(name="char_id") 
    public int charId = 0;
    
    @Column(name="player_name") 
    public String playerName = "";
    
    @Column(name="lv") 
    public int lv = 1;
    
    @Column(name="team_exp") 
    public int teamExp = 0;
    
    @Column(name="team_lv") 
    public int teamLv = 0;
    
    @Column(name="job_flag") 
    public int jobFlag = 0;
    
    @Column(name="dateline") 
    public Calendar dateline;
    
    @Column(name="status") 
    public int status = 0;
    
    @Column(name="logout_time") 
    public Calendar logoutTime;
    
    @Column(name="is_online") 
    public Boolean isOnline = false;
    
    @Column(name="selected") 
    public Boolean selected = false;
    
    @Column(name="myself") 
    public Boolean myself = false;
    
    @Column(name="could_invite")
    public Boolean couldInvite = false;
    
    @Column(name="new_msg_num") 
    public int newMsgNum = 0;
    
    public static ClientTeamUserBean getDemo() {
        // retorna 0 quando não tiver time
        
        Calendar dateline = Calendar.getInstance();
        dateline.setTimeInMillis(1464534552130L);
        
        Calendar logoutTime = Calendar.getInstance();
        logoutTime.setTimeInMillis(1464534562680L);
        
        ClientTeamUserBean ct = new ClientTeamUserBean();
        ct.setId(1956511);
        ct.setCharId(1653573);
        ct.setCouldInvite(false);
        ct.setDateline(dateline);
        ct.setJobFlag(1);
        ct.setLogoutTime(logoutTime);
        ct.setLv(32);
        ct.isMySelf(false);
        ct.setNewMsgNum(0);
        ct.setPlayerName("ExtremsX");
        ct.isSelected(false);
        ct.setStatus(1);
        ct.setTeamExp(0);
        ct.setTeamId(21392);
        ct.setTeamLv(1);
        ct.isOnline(false);
        
        return ct;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public int getCharId() {
        return charId;
    }

    public void setCharId(int charId) {
        this.charId = charId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getLv() {
        return lv;
    }

    public void setLv(int lv) {
        this.lv = lv;
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

    public int getJobFlag() {
        return jobFlag;
    }

    public void setJobFlag(int jobFlag) {
        this.jobFlag = jobFlag;
    }

    public Calendar getDateline() {
        return dateline;
    }

    public void setDateline(Calendar dateline) {
        this.dateline = dateline;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Calendar getLogoutTime() {
        return logoutTime;
    }

    public void setLogoutTime(Calendar logoutTime) {
        this.logoutTime = logoutTime;
    }

    public Boolean isOnline() {
        return isOnline;
    }

    public void isOnline(Boolean isOnline) {
        this.isOnline = isOnline;
    }

    public Boolean isSelected() {
        return selected;
    }

    public void isSelected(Boolean selected) {
        this.selected = selected;
    }

    public Boolean isMySelf() {
        return myself;
    }

    public void isMySelf(Boolean myself) {
        this.myself = myself;
    }

    public Boolean getCouldInvite() {
        return couldInvite;
    }

    public void setCouldInvite(Boolean couldInvite) {
        this.couldInvite = couldInvite;
    }

    public int getNewMsgNum() {
        return newMsgNum;
    }

    public void setNewMsgNum(int newMsgNum) {
        this.newMsgNum = newMsgNum;
    }

    @Override
    public String toString() {
        return "ClientTeamUserBean [id=" + id + ", teamId=" + teamId + ", charId=" + charId + ", playerName="
                + playerName + ", lv=" + lv + ", teamExp=" + teamExp + ", teamLv=" + teamLv + ", jobFlag=" + jobFlag
                + ", dateline=" + dateline + ", status=" + status + ", logoutTime=" + logoutTime + ", isOnline="
                + isOnline + ", selected=" + selected + ", myself=" + myself + ", couldInvite=" + couldInvite
                + ", newMsgNum=" + newMsgNum + "]";
    }
}
