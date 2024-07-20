package com.yash.Demohib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;






/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	FullName name= new FullName();
    	
    	name.setFname("Yash");
    	name.setMname("Ganeshwar");
    	name.setLname("Thakur");
    	
    	
    	
       Alien a= new Alien();
       
       
       a.setAid(1);
       a.setName(name);
       a.setColor("Orange");
       
       
//       a.setAid(4);
//       a.setAname("Vishrut");
//       a.setColor("Cyan");
       
       Configuration con= new Configuration().configure().addAnnotatedClass(Alien.class);
       ServiceRegistry reg= new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
       SessionFactory sf= con.buildSessionFactory(reg);
       Session session = sf.openSession();
       
       Transaction tx= session.beginTransaction();
       
//       a=(Alien) session.get(Alien.class, 2);
       
       session.save(a);
       
//       System.out.println(a);

       tx.commit();


       
       
    }
}
