package bean;

import java.io.Serializable;
import java.util.Calendar;

@SuppressWarnings("serial")
public class AnnounceInfo implements Serializable {
    public long id;
    public int ttype;
    public String content;
    public int flag;
    public Calendar startTime;
    public Calendar endTime;
    public String flaggm;
    public Calendar dateline;
    public int roomChannelId;
    public int announceType;
    public int intervalTime;
    
    public static AnnounceInfo[] getDemo() {
        Calendar startTime = Calendar.getInstance();
        startTime.setTimeInMillis(1464268334000L);
        
        Calendar endTime = Calendar.getInstance();
        endTime.setTimeInMillis(1464311602000L);
        
        Calendar dateline = Calendar.getInstance();
        dateline.setTimeInMillis(0);
        
        AnnounceInfo a = new AnnounceInfo();
        a.setId(11);
        a.setTType(1);
        a.setContent("<a href='http://goo.gl/forms/mX0GMJAeoa' target='_blank'>Evento promovendo talentos, concorra a uma rugido balrog e ganhe código brinde (só os duzentos primeiros*)! Clique aqui e participe!</a>");
        a.setFlag(1);
        a.setStartTime(startTime);
        a.setEndTime(endTime);
        a.setFlagGM(null);
        a.setDateline(dateline);
        a.setRoomChannelId(0);
        a.setAnnounceType(0);
        a.setIntervalTime(0);
        
        return new AnnounceInfo[] {a};
    }
    
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public int getTType() {
        return ttype;
    }
    public void setTType(int ttype) {
        this.ttype = ttype;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public int getFlag() {
        return flag;
    }
    public void setFlag(int flag) {
        this.flag = flag;
    }
    public Calendar getStartTime() {
        return startTime;
    }
    public void setStartTime(Calendar startTime) {
        this.startTime = startTime;
    }
    public Calendar getEndTime() {
        return endTime;
    }
    public void setEndTime(Calendar endTime) {
        this.endTime = endTime;
    }
    public String getFlagGM() {
        return flaggm;
    }
    public void setFlagGM(String flaggm) {
        this.flaggm = flaggm;
    }
    public Calendar getDateline() {
        return dateline;
    }
    public void setDateline(Calendar dateline) {
        this.dateline = dateline;
    }
    public int getRoomChannelId() {
        return roomChannelId;
    }
    public void setRoomChannelId(int roomChannelId) {
        this.roomChannelId = roomChannelId;
    }
    public int getAnnounceType() {
        return announceType;
    }
    public void setAnnounceType(int announceType) {
        this.announceType = announceType;
    }
    public int getIntervalTime() {
        return intervalTime;
    }
    public void setIntervalTime(int intervalTime) {
        this.intervalTime = intervalTime;
    }
    
    @Override
    public String toString() {
        return "AnnounceInfo [id=" + id + ", ttype=" + ttype + ", content=" + content + ", flag=" + flag
                + ", startTime=" + startTime + ", endTime=" + endTime + ", flaggm=" + flaggm + ", dateline=" + dateline
                + ", roomChannelId=" + roomChannelId + ", announceType=" + announceType + ", intervalTime="
                + intervalTime + "]";
    }
}
