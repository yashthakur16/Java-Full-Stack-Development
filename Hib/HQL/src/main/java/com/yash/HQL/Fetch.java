package com.yash.HQL;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;

public class Fetch {

	public static void main(String[] args) 
	{
		Configuration con = new Configuration().configure().addAnnotatedClass(pc.class);
		ServiceRegistry reg= new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        SessionFactory sf = con.buildSessionFactory(reg);
        Session session = sf.openSession();
        
        session.beginTransaction();
        
        Query q = session.createQuery("select price from pc where brand='Sony'");
        List<Integer> result=(List<Integer>)q.list();
        
        for(Integer r : result)
        {
        	System.out.println(r);
        }
        
        pc l =session.get(pc.class, 51);
        System.out.println(l);
        
    

	}

}
