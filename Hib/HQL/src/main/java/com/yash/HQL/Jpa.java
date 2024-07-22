package com.yash.HQL;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Jpa {

	public static void main(String[] args) {

		EntityManagerFactory emf= Persistence.createEntityManagerFactory(null);
		EntityManager em = emf.createEntityManager();
		
		pc p = em.find(pc.class, 51);
		
		System.out.println(p);
		

	}

}
