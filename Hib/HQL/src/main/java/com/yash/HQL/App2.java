package com.yash.HQL;

import java.util.Random;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class App2 {

	public static void main(String[] args) 
	{
		Configuration con = new Configuration().configure().addAnnotatedClass(pc.class);
		ServiceRegistry reg= new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        SessionFactory sf = con.buildSessionFactory(reg);
        Session session = sf.openSession();
        
        session.beginTransaction();
        Random r =new Random();
        
//        for(int i=1;i<=50;i++)
//        {
//        	pc p =new pc();
//        	p.setBrand("brand "+i);
//        	p.setLid(i);
//        	p.setPrice(r.nextInt(70000));
//        	session.save(p);
//        }
        
        pc p =new pc();
    	p.setBrand("Lenovo");
    	p.setLid(53);
    	p.setPrice(5000);
    	
    	
    	session.save(p);
    	
  
        
    	session.getTransaction().commit();
    	session.evict(p);
    	p.setPrice(60000);
    
    	session.close();

	}

}
