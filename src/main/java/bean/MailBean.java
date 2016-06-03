package bean;

import java.io.Serializable;
import java.util.Calendar;

@SuppressWarnings("serial")
public class MailBean implements Serializable {
    public long id = 0;
    public int charId = 0;
    public int fromCharId = 0;
    public String fromer = "";
    public int type = 0;
    public String title = "";
    public String content = "";
    public int readFlag = 0;
    public Calendar dateline;
    public int mailPackId = 0;
    public int receivePackFlag = 0;
    public Boolean isSelected = false;
    public String label = "";
    public String icon = "";
    public Boolean isDirty;
    
    public static MailBean[] getDemo() {
        Calendar dateline = Calendar.getInstance();
        dateline.setTimeInMillis(1463848288269L);
        
        MailBean a = new MailBean();
        a.setId(109675920);
        a.setCharId(1653573);
        a.setFromCharId(0);
        a.setFromer("");
        a.setType(1);
        a.setTitle("Comunicado do Clã, content=Parabéns! Você é novo integrante do clã {[OsPro]}, você já pode entrar na página do clã");
        a.setReadFlag(1);
        a.setDateline(dateline); //1463848288s 269ms
        a.setMailPackId(0);
        a.setReceivePackFlag(0);
        a.isSelected(false);
        a.setLabel("");
        a.setIcon("");
        a.isDirty(null);
        
        return new MailBean[] {a};
    }
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public int getCharId() {
        return charId;
    }
    public void setCharId(int charId) {
        this.charId = charId;
    }
    public int getFromCharId() {
        return fromCharId;
    }
    public void setFromCharId(int fromCharId) {
        this.fromCharId = fromCharId;
    }
    public String getFromer() {
        return fromer;
    }
    public void setFromer(String fromer) {
        this.fromer = fromer;
    }
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public int getReadFlag() {
        return readFlag;
    }
    public void setReadFlag(int readFlag) {
        this.readFlag = readFlag;
    }
    public Calendar getDateline() {
        return dateline;
    }
    public void setDateline(Calendar dateline) {
        this.dateline = dateline;
    }
    public int getMailPackId() {
        return mailPackId;
    }
    public void setMailPackId(int mailPackId) {
        this.mailPackId = mailPackId;
    }
    public int getReceivePackFlag() {
        return receivePackFlag;
    }
    public void setReceivePackFlag(int receivePackFlag) {
        this.receivePackFlag = receivePackFlag;
    }
    public Boolean isSelected() {
        return isSelected;
    }
    public void isSelected(Boolean isSelected) {
        this.isSelected = isSelected;
    }
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public String getIcon() {
        return icon;
    }
    public void setIcon(String icon) {
        this.icon = icon;
    }
    public Boolean isDirty() {
        return isDirty;
    }
    public void isDirty(Boolean isDirty) {
        this.isDirty = isDirty;
    }
    
    @Override
    public String toString() {
        return "MailBean [id=" + id + ", charId=" + charId + ", fromCharId=" + fromCharId + ", fromer=" + fromer
                + ", type=" + type + ", title=" + title + ", content=" + content + ", readFlag=" + readFlag
                + ", dateline=" + dateline + ", mailPackId=" + mailPackId + ", receivePackFlag=" + receivePackFlag
                + ", isSelected=" + isSelected + ", label=" + label + ", icon=" + icon + ", isDirty=" + isDirty + "]";
    }
    
}
