package bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class RaceBattleData implements Serializable {
	private int id = 0;
	private int cid = 0;
	private int battleNum = 0;
	private int winNum = 0;
	private int runNum = 0;
	private int killNum = 0;
	private int deadNum = 0;
	private int headKillNum = 0;
	private int aliveNum = 0;
	private int totleFieldNum = 0;
	private Boolean isDirty = false;
	private int battleEndNum = 0;
	private int seasonStartGameNum = 0;
	
	/*
    public static RaceBattleData getDemo() {
    	RaceBattleData o = new RaceBattleData();
    	
    	o.setAliveNum();
    	o.setBattleEndNum();
    	o.setCid();
    	o.setDeadNum();
    	o.setHeadKillNum();
    	o.setId();
    	o.setKillNum();
    	o.setRunNum();
    	o.setSeasonStartGameNum();
    	o.setTotleFieldNum();
    	o.setWinNum();
    	
    	return o;
    }
    */
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public int getBattleNum() {
		return battleNum;
	}
	public void setBattleNum(int battleNum) {
		this.battleNum = battleNum;
	}
	public int getWinNum() {
		return winNum;
	}
	public void setWinNum(int winNum) {
		this.winNum = winNum;
	}
	public int getRunNum() {
		return runNum;
	}
	public void setRunNum(int runNum) {
		this.runNum = runNum;
	}
	public int getKillNum() {
		return killNum;
	}
	public void setKillNum(int killNum) {
		this.killNum = killNum;
	}
	public int getDeadNum() {
		return deadNum;
	}
	public void setDeadNum(int deadNum) {
		this.deadNum = deadNum;
	}
	public int getHeadKillNum() {
		return headKillNum;
	}
	public void setHeadKillNum(int headKillNum) {
		this.headKillNum = headKillNum;
	}
	public int getAliveNum() {
		return aliveNum;
	}
	public void setAliveNum(int aliveNum) {
		this.aliveNum = aliveNum;
	}
	public int getTotleFieldNum() {
		return totleFieldNum;
	}
	public void setTotleFieldNum(int totleFieldNum) {
		this.totleFieldNum = totleFieldNum;
	}
	public Boolean getIsDirty() {
		return isDirty;
	}
	public void setIsDirty(Boolean isDirty) {
		this.isDirty = isDirty;
	}
	public int getBattleEndNum() {
		return battleEndNum;
	}
	public void setBattleEndNum(int battleEndNum) {
		this.battleEndNum = battleEndNum;
	}
	public int getSeasonStartGameNum() {
		return seasonStartGameNum;
	}
	public void setSeasonStartGameNum(int seasonStartGameNum) {
		this.seasonStartGameNum = seasonStartGameNum;
	}
}