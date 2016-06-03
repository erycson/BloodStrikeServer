package bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class RankUserBean implements Serializable {
	private int id = 0;
    private int cid = 0;
    private int rankState = 0;
    private int rankResult1 = -10000;
    private int rankResult2 = -10000;
    private int rankResult3 = -10000;
    private int rankResult4 = -10000;
    private int rankResult5 = -10000;
    private int protectedCnt = 0;
    private int lastScore = 0;
    private int rankSect = 0;
    private int rankLv = 1;
    private int rankScore = 100;
    private int isKing = 0;
    private Boolean isDirty = false;
    private int historyRankSect = 0;
    private int historyLv = 0;
    private int historyScore = 0;
    private int historyKingRank = 0;
    private int historyRank = 0;
    

    public static RankUserBean getDemo() {
    	RankUserBean o = new RankUserBean();
    	
    	o.setCid(1653573);
    	o.setHistoryKingRank(0);
    	o.setHistoryLv(13);
    	o.setHistoryRank(0);
    	o.setHistoryRankSect(3);
    	o.setHistoryScore(1322);
    	o.setId(1653613);
    	o.setIsKing(0);
    	o.setLastScore(0);
    	o.setProtectedCnt(4);
    	o.setRankLv(13);
    	o.setRankResult1(30);
    	o.setRankResult2(36);
    	o.setRankResult3(-10000);
    	o.setRankResult4(-10000);
    	o.setRankResult5(-10000);
    	o.setRankScore(1322);
    	o.setRankSect(3);
    	o.setRankState(3);
    	
    	return o;
    }
    
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
	public int getRankState() {
		return rankState;
	}
	public void setRankState(int rankState) {
		this.rankState = rankState;
	}
	public int getRankResult1() {
		return rankResult1;
	}
	public void setRankResult1(int rankResult1) {
		this.rankResult1 = rankResult1;
	}
	public int getRankResult2() {
		return rankResult2;
	}
	public void setRankResult2(int rankResult2) {
		this.rankResult2 = rankResult2;
	}
	public int getRankResult3() {
		return rankResult3;
	}
	public void setRankResult3(int rankResult3) {
		this.rankResult3 = rankResult3;
	}
	public int getRankResult4() {
		return rankResult4;
	}
	public void setRankResult4(int rankResult4) {
		this.rankResult4 = rankResult4;
	}
	public int getRankResult5() {
		return rankResult5;
	}
	public void setRankResult5(int rankResult5) {
		this.rankResult5 = rankResult5;
	}
	public int getProtectedCnt() {
		return protectedCnt;
	}
	public void setProtectedCnt(int protectedCnt) {
		this.protectedCnt = protectedCnt;
	}
	public int getLastScore() {
		return lastScore;
	}
	public void setLastScore(int lastScore) {
		this.lastScore = lastScore;
	}
	public int getRankSect() {
		return rankSect;
	}
	public void setRankSect(int rankSect) {
		this.rankSect = rankSect;
	}
	public int getRankLv() {
		return rankLv;
	}
	public void setRankLv(int rankLv) {
		this.rankLv = rankLv;
	}
	public int getRankScore() {
		return rankScore;
	}
	public void setRankScore(int rankScore) {
		this.rankScore = rankScore;
	}
	public int getIsKing() {
		return isKing;
	}
	public void setIsKing(int isKing) {
		this.isKing = isKing;
	}
	public Boolean getIsDirty() {
		return isDirty;
	}
	public void setIsDirty(Boolean isDirty) {
		this.isDirty = isDirty;
	}
	public int getHistoryRankSect() {
		return historyRankSect;
	}
	public void setHistoryRankSect(int historyRankSect) {
		this.historyRankSect = historyRankSect;
	}
	public int getHistoryLv() {
		return historyLv;
	}
	public void setHistoryLv(int historyLv) {
		this.historyLv = historyLv;
	}
	public int getHistoryScore() {
		return historyScore;
	}
	public void setHistoryScore(int historyScore) {
		this.historyScore = historyScore;
	}
	public int getHistoryKingRank() {
		return historyKingRank;
	}
	public void setHistoryKingRank(int historyKingRank) {
		this.historyKingRank = historyKingRank;
	}
	public int getHistoryRank() {
		return historyRank;
	}
	public void setHistoryRank(int historyRank) {
		this.historyRank = historyRank;
	}

	@Override
	public String toString() {
		return "RankUserBean [id=" + id + ", cid=" + cid + ", rankState=" + rankState + ", rankResult1=" + rankResult1
				+ ", rankResult2=" + rankResult2 + ", rankResult3=" + rankResult3 + ", rankResult4=" + rankResult4
				+ ", rankResult5=" + rankResult5 + ", protectedCnt=" + protectedCnt + ", lastScore=" + lastScore
				+ ", rankSect=" + rankSect + ", rankLv=" + rankLv + ", rankScore=" + rankScore + ", isKing=" + isKing
				+ ", isDirty=" + isDirty + ", historyRankSect=" + historyRankSect + ", historyLv=" + historyLv
				+ ", historyScore=" + historyScore + ", historyKingRank=" + historyKingRank + ", historyRank="
				+ historyRank + "]";
	}
}
