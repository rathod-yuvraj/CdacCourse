package day3;
import java.util.Date;
public class Student {

	private int id;
	private String name;
	private float m1;
	private float m2;
	private Date bdate;
	
	//default constructor
	public Student()
	{
		System.out.println("this sis default construcor");
		id = 0;
		name = null;
		m1  = 0.0f;
		m2 = 0.0f;
		bdate = null;
		
	}
	
	public Student(int id, String nm,float m1,float m2) {

		System.out.println("this is paramatric construtor");
		this.id =id;
		this.name = nm;
		this.m1 = m1;
		this.m2 = m2;
	    bdate = bdt
		
		//setter 
		
		
		
	}
	
	//Setter 
	public void setId(int id)
	{
		this.id = id;
	}
	
	public void setName(String s)
	{
		this.name = s;
	}
	
	public void setM1(float m1)
	{
		this.m1 = m1;
	}
	
	public void setM2(float m2)
	{
		this.m2 = m2;
	}
	
	public void setBdate(Date d)
	{
		this.bdate = d;
	}
	//Getter methods
	public int getid () {
		return id;
	}
	public String getName() {
		return name;
		
	}
	public float getM1() {
	return m1;
    }
	
	public float getM2() {
		return m2;
	    }
	public Date getBDate() {
		return bdate;
	}
		public static void main(String[] args) 
		{
			System.out.println("Student constructo");
			 int var10000 = this.id;
		     return "Id: " + var10000 + " Name: " + this.name + " M1:" + this.m1 + " M2:" + this.m2 + " Bdate:" + String.valueOf(this.bdate);
		}
	
}	