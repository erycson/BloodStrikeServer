package bean;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import flex.messaging.io.amf.ASObject;

@SuppressWarnings("serial")
public class InstallmentBean implements Serializable {
	private double id;
	private int cid; // unsigned int
	private int storageId; // unsigned int
	private int[] timeValueRefundMap; // ou Map
	private double buyTime;
	private double activityEndTime; // new Date(activityEndTime)
	private Boolean refundEndFlag;
	private Boolean freezeFlag;

    public static ASObject getDemo() {
        return new ASObject();
    }
	
    public double getId() {
        return id;
    }
    public void setId(double id) {
        this.id = id;
    }
    public int getCid() {
        return cid;
    }
    public void setCid(int cid) {
        this.cid = cid;
    }
    public int getStorageId() {
        return storageId;
    }
    public void setStorageId(int storageId) {
        this.storageId = storageId;
    }
    public int[] getTimeValueRefundMap() {
        return timeValueRefundMap;
    }
    public void setTimeValueRefundMap(int[] timeValueRefundMap) {
        this.timeValueRefundMap = timeValueRefundMap;
    }
    public double getBuyTime() {
        return buyTime;
    }
    public void setBuyTime(double buyTime) {
        this.buyTime = buyTime;
    }
    public double getActivityEndTime() {
        return activityEndTime;
    }
    public void setActivityEndTime(double activityEndTime) {
        this.activityEndTime = activityEndTime;
    }
    public Boolean getRefundEndFlag() {
        return refundEndFlag;
    }
    public void setRefundEndFlag(Boolean refundEndFlag) {
        this.refundEndFlag = refundEndFlag;
    }
    public Boolean getFreezeFlag() {
        return freezeFlag;
    }
    public void setFreezeFlag(Boolean freezeFlag) {
        this.freezeFlag = freezeFlag;
    }
    
    @Override
    public String toString() {
        return "InstallmentBean [id=" + id + ", cid=" + cid + ", storageId=" + storageId + ", timeValueRefundMap="
                + Arrays.toString(timeValueRefundMap) + ", buyTime=" + buyTime + ", activityEndTime=" + activityEndTime
                + ", refundEndFlag=" + refundEndFlag + ", freezeFlag=" + freezeFlag + "]";
    }
}

