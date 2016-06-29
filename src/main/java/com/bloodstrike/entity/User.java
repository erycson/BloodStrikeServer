package com.bloodstrike.entity;

import javax.persistence.*;

@Entity
@Table(name="users")
@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue
    @Column(name="id") 
    protected int userId = 0;
    
    @Column(name="name") 
    protected String username = "";
    
    @Column(name="password") 
    protected String password = "";
    
    @Column(name="token") 
    protected String token = "";
    
    @Column(name="changename") 
    protected String changename = "";
    
    @Column(name="sign") 
    protected String sign;
    
    @Column(name="timestamp") 
    protected int timestamp;

    @Column(name="isadult") 
    protected int isadult = 0;

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

    public String getChangeName() {
        return changename;
    }

    public void setChangeName(String changename) {
        this.changename = changename;
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
}
