package bean;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * Item comprado pelo usuário
 */
@SuppressWarnings("serial")
public class StorageBean implements Serializable {
    private int id;
    private int tid;
    private int damaged;
    private int equipedBag; // -1
    private int amount;
    private int type; // 1 = weapon, 2 = avatar, 3 = item, 4
    private int expiredTime;
    private int moneyType; // 0
    private int selectFlag; // 0
    
    public static Map<Integer, StorageBean> getDemo() {
        
        StorageBean s1 = new StorageBean();
        s1.setId(20649068);
        s1.setTId(9);
        s1.setDamaged(0);
        s1.setEquipedBag(0);
        s1.setAmount(1);
        s1.setType(1);
        s1.setExpiredTime(0);
        s1.setMoneyType(0);
        s1.setSelectFlag(0);
        
        StorageBean s2 = new StorageBean();
        s2.setId(90925002);
        s2.setTId(6);
        s2.setDamaged(838);
        s2.setEquipedBag(0);
        s2.setAmount(1);
        s2.setType(1);
        s2.setExpiredTime(0);
        s2.setMoneyType(2);
        s2.setSelectFlag(0);
        
        StorageBean s3 = new StorageBean();
        s3.setId(92285537);
        s3.setTId(11);
        s3.setDamaged(2054);
        s3.setEquipedBag(0);
        s3.setAmount(1);
        s3.setType(1);
        s3.setExpiredTime(0);
        s3.setMoneyType(2);
        s3.setSelectFlag(0);
        
        StorageBean s4 = new StorageBean();
        s4.setId(90777112);
        s4.setTId(20);
        s4.setDamaged(0);
        s4.setEquipedBag(0);
        s4.setAmount(1);
        s4.setType(1);
        s4.setExpiredTime(0);
        s4.setMoneyType(2);
        s4.setSelectFlag(0);

        Map<Integer, StorageBean> s = new HashMap<Integer, StorageBean>();
        s.put(s1.getId(), s1);
        s.put(s2.getId(), s2);
        s.put(s3.getId(), s3);
        s.put(s4.getId(), s4);
        
        return s;
    }
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTId() {
		return tid;
	}
	public void setTId(int tid) {
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
		return "StorageBean [id=" + id + ", tid=" + tid + ", damaged=" + damaged + ", equipedBag=" + equipedBag
				+ ", amount=" + amount + ", type=" + type + ", expiredTime=" + expiredTime + ", moneyType=" + moneyType
				+ ", selectFlag=" + selectFlag + "]";
	}
    
    
}
