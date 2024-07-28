package com.yash.SpringFDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Alien 
{
 
	private int age;
	
	ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
	private Laptop lap=context.getBean(Laptop.class);
	
	public void code()
	{
		System.out.println("I'm coding... "+age);
		lap.compile();
	}
	
	public int getAge() {
		
		System.out.println("hey i m called...");
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	public Laptop getLap() {
		return lap;
	}

	public void setLap(Laptop lap) {
		this.lap = lap;
	}
	
	
}
