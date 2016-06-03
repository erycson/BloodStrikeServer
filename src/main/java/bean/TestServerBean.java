package bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class TestServerBean implements Serializable {
    public int minLv = 0;
    public int maxLv = 0;
    public Boolean openFlag = false;
    
    public int getMinLv() {
        return minLv;
    }
    public void setMinLv(int minLv) {
        this.minLv = minLv;
    }
    public int getMaxLv() {
        return maxLv;
    }
    public void setMaxLv(int maxLv) {
        this.maxLv = maxLv;
    }
    public Boolean getOpenFlag() {
        return openFlag;
    }
    public void setOpenFlag(Boolean openFlag) {
        this.openFlag = openFlag;
    }
    
    @Override
    public String toString() {
        return "TestServerBean [minLv=" + minLv + ", maxLv=" + maxLv + ", openFlag=" + openFlag + "]";
    }
}
