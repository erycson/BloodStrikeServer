package bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class WeaponUnlockBean implements Serializable {
    public int id = 0;
    public int status = 0; // 1,2,3,4
    public int itemId = 0;
    public int kind = 0;
    public int position;
    
    public static WeaponUnlockBean[] getDemo() {
        WeaponUnlockBean wu1 = new WeaponUnlockBean();
        wu1.setId(1);
        wu1.setStatus(2);
        WeaponUnlockBean wu2 = new WeaponUnlockBean();
        wu1.setId(2);
        wu1.setStatus(2);
        WeaponUnlockBean wu3 = new WeaponUnlockBean();
        wu1.setId(3);
        wu1.setStatus(2);
        WeaponUnlockBean wu4 = new WeaponUnlockBean();
        wu1.setId(4);
        wu1.setStatus(1);
        WeaponUnlockBean wu5 = new WeaponUnlockBean();
        wu1.setId(40);
        wu1.setStatus(3);
        
        return new WeaponUnlockBean[] {wu1, wu2, wu3, wu4, wu5};
    }
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public int getItemId() {
        return itemId;
    }
    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
    public int getKind() {
        return kind;
    }
    public void setKind(int kind) {
        this.kind = kind;
    }
    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }
    
    @Override
    public String toString() {
        return "WeaponUnlockBean [id=" + id + ", status=" + status + ", itemId=" + itemId + ", kind=" + kind
                + ", position=" + position + "]";
    }
}
