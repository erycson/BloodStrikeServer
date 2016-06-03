package bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class FastSettingBean implements Serializable {
	private int raceType = 0;
    private int subRaceType = 0;
    private int sceneId = 0;
    private int pveLevel = 0;
    
    public static FastSettingBean getDemo() {
        FastSettingBean fs = new FastSettingBean();
        fs.setRaceType(0);
        fs.setSubRaceType(0);
        fs.setSceneId(0);
        fs.setPveLevel(0);

        return fs;
    }
    
	public int getRaceType() {
		return raceType;
	}
	public void setRaceType(int raceType) {
		this.raceType = raceType;
	}
	public int getSubRaceType() {
		return subRaceType;
	}
	public void setSubRaceType(int subRaceType) {
		this.subRaceType = subRaceType;
	}
	public int getSceneId() {
		return sceneId;
	}
	public void setSceneId(int sceneId) {
		this.sceneId = sceneId;
	}
	public int getPveLevel() {
		return pveLevel;
	}
	public void setPveLevel(int pveLevel) {
		this.pveLevel = pveLevel;
	}
	
	@Override
	public String toString() {
		return "FastSettingBean [raceType=" + raceType + ", subRaceType=" + subRaceType + ", sceneId=" + sceneId
				+ ", pveLevel=" + pveLevel + "]";
	}
}
