package com.app.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      
    	SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
    	Session s=sf.openSession();
    	Student st=new Student();
    	s.beginTransaction();
    	st.setName("Krishna");
    	st.setPass('p');
    	st.setTotal_marks(80);
    	s.save(st);
    	s.getTransaction().commit();
    	
    }
}
