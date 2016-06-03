package bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class WeaponItem implements Serializable {
    private int id;
    private int tid;
    private int damaged;
    private int equipedBag; // -1
    private int amount;
    private int type; // 1 = weapon, 2 = avatar, 3 = item, 4
    private int expiredTime;
    private int moneyType; // 0
    private int selectFlag; // 0
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getTid() {
        return tid;
    }
    public void setTid(int tid) {
        this.tid = tid;
    }
    public int getDamaged() {
        return damaged;
    }
    public void setDamaged(int damaged) {
        this.damaged = damaged;
    }
    public int getEquipedBag() {
        return equipedBag;
    }
    public void setEquipedBag(int equipedBag) {
        this.equipedBag = equipedBag;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public int getType() {
        return type;
    }
    public void setType(int type) {
        this.type = type;
    }
    public int getExpiredTime() {
        return expiredTime;
    }
    public void setExpiredTime(int expiredTime) {
        this.expiredTime = expiredTime;
    }
    public int getMoneyType() {
        return moneyType;
    }
    public void setMoneyType(int moneyType) {
        this.moneyType = moneyType;
    }
    public int getSelectFlag() {
        return selectFlag;
    }
    public void setSelectFlag(int selectFlag) {
        this.selectFlag = selectFlag;
    }
    
    @Override
    public String toString() {
        return "WeaponItem [id=" + id + ", tid=" + tid + ", damaged=" + damaged + ", equipedBag=" + equipedBag
                + ", amount=" + amount + ", type=" + type + ", expiredTime=" + expiredTime + ", moneyType=" + moneyType
                + ", selectFlag=" + selectFlag + "]";
    }
}
