package com.yuvraj.beans;

import java.util.Objects;

public class Student {
	private int sRoll;
	private String sName;
	private int M1;
	private int M2;
	private int sAge;
	
	
	
	public Student(int sRoll, String sName, int m1, int m2, int sAge) {
		super();
		this.sRoll = sRoll;
		this.sName = sName;
		M1 = m1;
		M2 = m2;
		this.sAge = sAge;
	}
	public Student(int sRoll) {
		super();
		this.sRoll = sRoll;
	}
	public int getM2() {
		return M2;
	}
	public void setM2(int m2) {
		M2 = m2;
	}
	public int getsRoll() {
		return sRoll;
	}
	public void setsRoll(int sRoll) {
		this.sRoll = sRoll;
	}
	public Student() {
		super();
	}
	public Student(int sRoll, String sName, int m1, int sAge) {
		super();
		this.sRoll = sRoll;
		this.sName = sName;
		M1 = m1;
		this.sAge = sAge;
	}
	public String getsName() {
		return sName;
	}
	@Override
	public String toString() {
		return "Student [sRoll=" + sRoll + ", sName=" + sName + ", M1=" + M1 + ", M2=" + M2 + ", sAge=" + sAge + "]";
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public int getM1() {
		return M1;
	}
	public void setM1(int m1) {
		M1 = m1;
	}
	public int getsAge() {
		return sAge;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return sRoll == other.sRoll;
	}

	
	

}
