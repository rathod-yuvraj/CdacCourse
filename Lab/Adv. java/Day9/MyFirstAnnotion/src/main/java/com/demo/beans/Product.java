package com.demo.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "myproduct")
public class Product {

    @Id
    private int pid;

    private String pname;

    @Column(name = "username")
    private String email;

    public Product() {
        super();
    }

    public Product(int pid, String pname, String email) {
        super();
        this.pid = pid;
        this.pname = pname;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Product [pid=" + pid + ", pname=" + pname + ", email=" + email + "]";
    }
}
