package com.yash.fetch;

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
    //    Alien a1 =new Alien();
    //    Alien a2= new Alien();
    //    Alien a3= new Alien();


    //    Laptop l1=new Laptop();
    //    Laptop l2= new Laptop();
    //    Laptop l3= new Laptop();
    //    Laptop l4= new Laptop();
    //    Laptop l5= new Laptop();


    //    a1.setAname("Yash");
    //    a1.setAid(1);

    //    a2.setAname("Rohan");
    //    a2.setAid(2);

    //    a3.setAname("Shrikunj");
    //    a3.setAid(3);

    //    l1.setLid(101);
    //    l1.setBrand("Mac");
    //    l1.setPrice(10000);
    //    l1.setAlien(a1);
       
    //    l2.setLid(102);
    //    l2.setBrand("Dell");
    //    l2.setPrice(1000);
    //    l2.setAlien(a1);

    //    l3.setLid(103);
    //    l3.setBrand("HP");
    //    l3.setPrice(10000);
    //    l3.setAlien(a2);

    //    l4.setLid(104);
    //    l4.setBrand("Lenovo");
    //    l4.setPrice(8000);
    //    l4.setAlien(a2);

    //    l5.setLid(105);
    //    l5.setBrand("Acer");
    //    l5.setPrice(9000);
    //    l5.setAlien(a1);

       




    //    a1.getLaptop().add(l1);
    //    a1.getLaptop().add(l2);
       
       Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class).addAnnotatedClass(Laptop.class);
       ServiceRegistry reg= new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
       SessionFactory sf = con.buildSessionFactory(reg);
       Session session = sf.openSession();
    //    session.beginTransaction();
    //    session.save(l1);
    //    session.save(l2);
    //    session.save(l3);
    //    session.save(l4);
    //    session.save(l5);
    //    session.save(a1);
    //    session.save(a2);
    //    session.save(a3);
    //    session.getTransaction().commit();
    
    Alien a1=session.get(Alien.class,1);

    System.out.println(a1);
    
       
    }
}
