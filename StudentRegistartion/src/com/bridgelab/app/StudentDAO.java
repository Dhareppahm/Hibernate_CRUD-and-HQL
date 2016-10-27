package com.bridgelab.app;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentDAO {

	public static int register(Student u){  
		 int i=0;  
		 Session session=new Configuration().  
		  configure().buildSessionFactory().openSession();  
		          
		  Transaction t=session.beginTransaction();  
		  t.begin();  
		                  
		  i=(Integer)session.save(u);  
		                  
		  t.commit();  
		  session.close();  
		    
		  return i;  
		 }  
		}  
