package com.yash.HQL;

import java.util.List;
import java.util.Map;
import java.util.Random;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.transform.Transformers;

import jakarta.persistence.criteria.CriteriaBuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration con = new Configuration().configure().addAnnotatedClass(Student.class);
        ServiceRegistry reg= new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
        SessionFactory sf = con.buildSessionFactory(reg);
        Session session = sf.openSession();
        
        session.beginTransaction();
//        Random r= new Random();
//        
//        for(int i=1;i<=50;i++)
//        {
//        	Student s=new Student();
//        	s.setRoll(i);
//        	s.setName("Name"+i);
//        	s.setMarks(r.nextInt(100));
//        	session.save(s);
//        }
        
//        Query q= session.createQuery("select name,marks from Student where roll=6");
//       Object [] s= (Object[])q.uniqueResult();
//        
//        for(Object i : s)
//        {
//        	System.out.println(i);
//        }
        
//        Student a =(Student)q.uniqueResult();
//        System.out.println(a);
//      
//        int a=60;
//        
//        Query q2= session.createQuery("Select sum(marks) from Student where marks< : b");
//        q2.setParameter("b", a);
//        Long marks= (Long) q2.uniqueResult();
//        
//        System.out.println(marks);
        
        NativeQuery query= session.createNativeQuery("select name,roll from Student where marks>60");
        
//        query.addEntity(Student.class);
        query.setResultTransformer(Transformers.ALIAS_TO_ENTITY_MAP);
        List students = query.list();
        
        for(Object s : students)
        {
        	Map m =(Map) s;
        	System.out.println(m.get("name")+ " : "+m.get("roll"));
        }
        
        
        
        
        session.getTransaction().commit();
        session.close();
        
    }
}
