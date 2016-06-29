package bean;

import java.io.Serializable;

/**
 * Slotes pre-configurado do usuário, com suas armas e bombas
 */
@SuppressWarnings("serial")
public class BagBean implements Serializable {
    
    public static int MASTER = 1;
    public static int SECONDARY = 2;
    public static int CLOSED = 3;
    public static int BOOM = 4;
    
    private double id = 0;
    private double masterWeapon = 0;
    private double secondaryWeapon = 0;
    private double closedWeapon = 0;
    private double boom1 = 0;
    private double boom2 = 0;
    private double boom3 = 0;
    
    public static BagBean[] getDemo() {
        BagBean b = new BagBean();
        b.setId(0);
        b.setMasterWeapon(92285537);
        b.setSecondaryWeapon(90925002);
        b.setClosedWeapon(20649068);
        b.setBoom1(90777112);
        b.setBoom2(0);
        b.setBoom3(0);

        //return new BagBean[] {b, b, b, b};
        return new BagBean[] {};
    }
    
    
	public double getId() {
		return id;
	}
	public void setId(double id) {
		this.id = id;
	}
	public double getMasterWeapon() {
		return masterWeapon;
	}
	public void setMasterWeapon(double masterWeapon) {
		this.masterWeapon = masterWeapon;
	}
	public double getSecondaryWeapon() {
		return secondaryWeapon;
	}
	public void setSecondaryWeapon(double secondaryWeapon) {
		this.secondaryWeapon = secondaryWeapon;
	}
	public double getClosedWeapon() {
		return closedWeapon;
	}
	public void setClosedWeapon(double closedWeapon) {
		this.closedWeapon = closedWeapon;
	}
	public double getBoom1() {
		return boom1;
	}
	public void setBoom1(double boom1) {
		this.boom1 = boom1;
	}
	public double getBoom2() {
		return boom2;
	}
	public void setBoom2(double boom2) {
		this.boom2 = boom2;
	}
	public double getBoom3() {
		return boom3;
	}
	public void setBoom3(double boom3) {
		this.boom3 = boom3;
	}
	
	@Override
	public String toString() {
		return "BagBean [id=" + id + ", masterWeapon=" + masterWeapon + ", secondaryWeapon=" + secondaryWeapon
				+ ", closedWeapon=" + closedWeapon + ", boom1=" + boom1 + ", boom2=" + boom2 + ", boom3=" + boom3 + "]";
	}
}
