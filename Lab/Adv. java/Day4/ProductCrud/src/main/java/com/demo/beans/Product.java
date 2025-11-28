package com.demo.beans;

import java.time.LocalDate;

public class Product {
   private int pid;
   private String pname;
   private Double qty;
   private Double price;
 //  private LocalDate expdt;
   private int cid;
public Product() {
	super();
}
public Product(int pid, String pname, Double qty, Double price, int cid) {
    this.pid = pid;
    this.pname = pname;
    this.qty = qty;
    this.price = price;
   // this.expdt = expdate;
    this.cid = cid;
}

public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public Double getQty() {
	return qty;
}
public void setQty(Double qty) {
	this.qty = qty;
}
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}

public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}

   
}
