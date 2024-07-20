package com.yash.relationMapping;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
      
        Student s1= new Student();
        Laptop l1= new Laptop();
        
        s1.setSid(1);
        s1.setSname("Yash");
        s1.setSmarks(98);

        l1.setLid(102);
        l1.setLname("Mac");
        s1.setL(l1);

        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        ServiceRegistry reg= new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        SessionFactory sf = con.buildSessionFactory(reg);
        Session session = sf.openSession();
        session.beginTransaction();
        session.save(s1);
        session.save(l1);
        session.getTransaction().commit();
    }
}
