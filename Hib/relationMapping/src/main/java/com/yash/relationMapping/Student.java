package com.yash.relationMapping;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Student 
{
	@Id
    private int Sid;
    private String Sname;
    private int Smarks;
  
    @ManyToMany(mappedBy = "student")
    private List<Laptop> laptop =new ArrayList<>();

  
	public List<Laptop> getLaptop() {
		return laptop;
	}
	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
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
