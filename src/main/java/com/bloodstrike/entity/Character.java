package com.bloodstrike.entity;

import java.util.Calendar;

import javax.persistence.*;

@Entity
@Table(name="users")
public class Character {
    @Id
    @GeneratedValue
    @Column(name="id") 
    protected int characterId;
    
    @Column(name="name") 
    protected String name;
    
    @Column(name="sign") 
    protected String sign;
    
    @Column(name="timestamp") 
    protected int timestamp;

    @Column(name="isadult") 
    protected int isadult = 0;

    @Column(name="reg_time") 
    protected Calendar regTime;
    
    @Column(name="login_time") 
    protected Calendar loginTime;

    @Column(name="level") 
    protected int level = 1;
    
    @Column(name="experience") 
    protected long experience = 0;
    
    @Column(name="gold") 
    protected int gold = 0;
    
    @Column(name="gp") 
    protected int gp = 30000;
    
    @Column(name="gift") 
    protected int gift = 0;

    @Column(name="avatar_t") 
    protected int avatarT = 1;
    
    @Column(name="avatar_ct") 
    protected int avatarCT = 2;
    
    @Column(name="avatar_sh") 
    protected int avatarSH = 0;
    
    @Column(name="default_avatar") 
    protected int defaultAvatar = 1; // uint

    @Column(name="remote_ip") 
    protected String remoteIp;

    public int getCharacterId() {
        return characterId;
    }

    public void setCharacterId(int characterId) {
        this.characterId = characterId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public int getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(int timestamp) {
        this.timestamp = timestamp;
    }

    public int getIsadult() {
        return isadult;
    }

    public void setIsadult(int isadult) {
        this.isadult = isadult;
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

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public long getExperience() {
        return experience;
    }

    public void setExperience(long experience) {
        this.experience = experience;
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

    public String getRemoteIp() {
        return remoteIp;
    }

    public void setRemoteIp(String remoteIp) {
        this.remoteIp = remoteIp;
    }
    
    
}
