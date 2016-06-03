package bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class SignInBean implements Serializable {
	private int charId = 0;
    private int totalCount = 0;
    private int[] reSignInList;
    private int onlineTime = 0;
    private int[] signInList;
    private Boolean dayThreeGift = false;
    private Boolean daySevenGift = false;
    private Boolean dayFourteenGift = false;
    private Boolean dayTwentyGift = false;
    private String username;
    private int lv;
    private Boolean teamExist;
    private int[] mobileSignInList;
    private int[] mobileReSignInList;
    private Boolean isDirty = false;
	public int getCharId() {
		return charId;
	}
	public void setCharId(int charId) {
		this.charId = charId;
	}
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	public int[] getReSignInList() {
		return reSignInList;
	}
	public void setReSignInList(int[] reSignInList) {
		this.reSignInList = reSignInList;
	}
	public int getOnlineTime() {
		return onlineTime;
	}
	public void setOnlineTime(int onlineTime) {
		this.onlineTime = onlineTime;
	}
	public int[] getSignInList() {
		return signInList;
	}
	public void setSignInList(int[] signInList) {
		this.signInList = signInList;
	}
	public Boolean getDayThreeGift() {
		return dayThreeGift;
	}
	public void setDayThreeGift(Boolean dayThreeGift) {
		this.dayThreeGift = dayThreeGift;
	}
	public Boolean getDaySevenGift() {
		return daySevenGift;
	}
	public void setDaySevenGift(Boolean daySevenGift) {
		this.daySevenGift = daySevenGift;
	}
	public Boolean getDayFourteenGift() {
		return dayFourteenGift;
	}
	public void setDayFourteenGift(Boolean dayFourteenGift) {
		this.dayFourteenGift = dayFourteenGift;
	}
	public Boolean getDayTwentyGift() {
		return dayTwentyGift;
	}
	public void setDayTwentyGift(Boolean dayTwentyGift) {
		this.dayTwentyGift = dayTwentyGift;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getLv() {
		return lv;
	}
	public void setLv(int lv) {
		this.lv = lv;
	}
	public Boolean getTeamExist() {
		return teamExist;
	}
	public void setTeamExist(Boolean teamExist) {
		this.teamExist = teamExist;
	}
	public int[] getMobileSignInList() {
		return mobileSignInList;
	}
	public void setMobileSignInList(int[] mobileSignInList) {
		this.mobileSignInList = mobileSignInList;
	}
	public int[] getMobileReSignInList() {
		return mobileReSignInList;
	}
	public void setMobileReSignInList(int[] mobileReSignInList) {
		this.mobileReSignInList = mobileReSignInList;
	}
	public Boolean getIsDirty() {
		return isDirty;
	}
	public void setIsDirty(Boolean isDirty) {
		this.isDirty = isDirty;
	}
    
    
}
