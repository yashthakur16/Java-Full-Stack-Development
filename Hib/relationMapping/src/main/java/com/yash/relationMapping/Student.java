package com.yash.relationMapping;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import jakarta.persistence.OneToOne;

@Entity
public class Student 
{
	@Id
    private int Sid;
    private String Sname;
    private int Smarks;
    @OneToOne
    private Laptop l;

    
    public Laptop getL() {
		return l;
	}
	public void setL(Laptop l) {
		this.l = l;
	}
	public int getSid() {
        return Sid;
    }
    public void setSid(int sid) {
        Sid = sid;
    }
    public String getSname() {
        return Sname;
    }
    public void setSname(String sname) {
        Sname = sname;
    }
    public int getSmarks() {
        return Smarks;
    }
    public void setSmarks(int smarks) {
        Smarks = smarks;
    }

    


}
