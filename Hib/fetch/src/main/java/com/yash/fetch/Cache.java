package com.yash.fetch;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class Cache {

	public static void main(String[] args)
	{
		Alien a=null;
		   Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class).addAnnotatedClass(Laptop.class);
	       ServiceRegistry reg= new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
	       SessionFactory sf = con.buildSessionFactory(reg);
	       Session session = sf.openSession();
	       session.beginTransaction();
	       
	       a=session.get(Alien.class, 1);
	       
	       System.out.println(a);
	       
	       session.getTransaction().commit();
	       session.close();
	       
	       Session session1 = sf.openSession();
	       session1.beginTransaction();
	       
	       
	       a=session1.get(Alien.class, 1);
	       
	       System.out.println(a);
	       session1.getTransaction().commit();
	       session1.close();
	       
	      
	}

}
