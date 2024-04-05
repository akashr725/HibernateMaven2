package com.JavaHibernate.HibernateMaven2;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
       Session ss=new Configuration().configure().buildSessionFactory().openSession();
       
       Emp e=new Emp();
       e.setId(1);
       e.setName("Akash");
       e.setAddress("Champahati");
       ss.persist(e);
       ss.beginTransaction();
       ss.getTransaction().commit();
       System.out.println("Saved");
       
       
    }
}
