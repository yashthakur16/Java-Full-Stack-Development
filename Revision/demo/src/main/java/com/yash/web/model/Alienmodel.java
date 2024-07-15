package com.yash.web.model;

public class Alienmodel 
{
	private String name;
	private int roll;
	private int marks;
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Alienmodel [name=" + name + ", roll=" + roll + ", marks=" + marks + "]";
	}
	
	
	
}
