package com.yash.Demohib;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Friend3")
public class Alien 
{
	@Id
	private int aid;
	
	private FullName name;

	private String color;
	
	
	
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	
	
	
	public FullName getName() {
		return name;
	}
	public void setName(FullName name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	@Override
	public String toString() {
		return "Alien [aid=" + aid + ", aname=" + name + ", color=" + color + "]";
	}
	
	
	
	
}
