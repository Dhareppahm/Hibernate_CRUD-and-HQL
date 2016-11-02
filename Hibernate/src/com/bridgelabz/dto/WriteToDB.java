package com.bridgelabz.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class WriteToDB {

	public static void main(String[] args) {
		
		//1.Create object ofDTO
		JobFairDTO job1=new JobFairDTO();
		job1.setJobId(123);
		job1.setCompanyName("Cisco");
		job1.setDesignation("Trainee engineer");	
		
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(JobFairDTO.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		ss.save(job1);
		  
		  
		org.hibernate.Transaction tx=ss.beginTransaction();
	    tx.commit();
	}

}
