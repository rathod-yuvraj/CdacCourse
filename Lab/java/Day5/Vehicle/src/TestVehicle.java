
import java.util.Date;

public class TestVehicle {
	
	 int vid;
	 String vownName;
	 String typOfVehicle;
	 Date dateOdPurchase;
	 public TestVehicle() {
		super();
	}
	public TestVehicle(int vid, String vownName, String typOfVehicle, Date dateOdPurchase) {
		super();
		this.vid = vid;
		this.vownName = vownName;
		this.typOfVehicle = typOfVehicle;
		this.dateOdPurchase = dateOdPurchase;
	}
	@Override
	public String toString() {
		return "TestVehicle [vid=" + vid + ", vownName=" + vownName + ", typOfVehicle=" + typOfVehicle
				+ ", dateOdPurchase=" + dateOdPurchase + "]";
	}
	public int getVid() {
		return vid;
	}
	public void setVid(int vid) {
		this.vid = vid;
	}
	public String getVownName() {
		return vownName;
	}
	public void setVownName(String vownName) {
		this.vownName = vownName;
	}
	public String getTypOfVehicle() {
		return typOfVehicle;
	}
	public void setTypOfVehicle(String typOfVehicle) {
		this.typOfVehicle = typOfVehicle;
	}
	public Date getDateOdPurchase() {
		return dateOdPurchase;
	}
	public void setDateOdPurchase(Date dateOdPurchase) {
		this.dateOdPurchase = dateOdPurchase;
	}
	
	 public static void main(String[] args) {
		 
		 TestVehicle obj=new TestVehicle(101,"yuvraj","4 wheelar",new Date(1997-10-11));
		 TestVehicle o=new TestVehicle(101,"yuvraj","4 wheelar",new Date(1997-10-11));
		 System.out.println(obj.toString());
		 System.out.println(o.toString());
	 }

	

}
