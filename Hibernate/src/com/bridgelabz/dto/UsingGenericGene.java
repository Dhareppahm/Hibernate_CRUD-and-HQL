package com.bridgelabz.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UsingGenericGene {

	public static void main(String[] args) {
		
		
		
		JobFairDTO job1=new JobFairDTO();
		//job1.setJobId(1234);
		job1.setCompanyName("State street");
		job1.setDesignation("Trainee engineer");	
		Configuration cfg=new Configuration();
		cfg.configure();
		//cfg.addAnnotatedClass(JobFairDTO.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		ss.save(job1);
		  
		  
		org.hibernate.Transaction tx=ss.beginTransaction();
	    tx.commit();
	}

}