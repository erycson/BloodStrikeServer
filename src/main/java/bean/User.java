package bean;

import javax.persistence.*;

//@Entity
//@Table(name="users")
//@Inheritance(strategy = InheritanceType.JOINED)
public class User {
    @Id
    @GeneratedValue
    @Column(name="user_id") 
    private int userId = 0;
    
    @Column(name="username") 
    private String username = "";
    
    @Column(name="changename") 
    private String changename = "";
    
    @Column(name="sign") 
    private String sign;
    
    @Column(name="timestamp") 
    private int timestamp;

    @Column(name="is_adult") 
    private int isadult = 0;
    
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
    public String getChangename() {
        return changename;
    }
    public void setChangename(String changename) {
        this.changename = changename;
    }
    public int isAdult() {
        return isadult;
    }
    public void isAdult(int isadult) {
        this.isadult = isadult;
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
}
