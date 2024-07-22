package com.yash.HQL;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Jpa {

	public static void main(String[] args) {

		pc p =new pc();
		p.setBrand("Samsung");
		p.setPrice(10000);
		p.setLid(54);

		EntityManagerFactory emf= Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		
		// pc p = em.find(pc.class, 51);
		
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();

		
		
		System.out.println(p);
		

	}

}
