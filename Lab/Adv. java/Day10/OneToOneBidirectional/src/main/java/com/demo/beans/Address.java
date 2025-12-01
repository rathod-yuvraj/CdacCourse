package com.demo.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "address123")
public class Address {

	@Id
	private int id;
	private String street;
	private String city;
	private String pincode;
	 @OneToOne(mappedBy="addr",fetch=FetchType.LAZY)  //mappedBy will not add foreign key
	   private MyUser user1;
	public Address() {
		super();
	}
	public Address(int id, String street, String city, String pincode) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.pincode = pincode;
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", street=" + street + ", city=" + city + ", pincode=" + pincode + "]";
	}

	
}
