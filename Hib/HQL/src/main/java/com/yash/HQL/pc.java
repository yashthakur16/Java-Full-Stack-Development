package com.yash.HQL;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class pc 
{
	@Id
	private int lid;
	private String brand;
	private int price;
	
	
	
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "pc [lid=" + lid + ", brand=" + brand + ", price=" + price + "]";
	}
	
	
	
}
