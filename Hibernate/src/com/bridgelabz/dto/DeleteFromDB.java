package com.bridgelabz.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteFromDB {

	public static void main(String[] args) {
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(JobFairDTO.class);
		
		
		//2nd componet
		
		SessionFactory sf=cfg.buildSessionFactory();
		//3rd componet
		
		Session sess=sf.openSession();
		
		JobFairDTO job3=sess.load(JobFairDTO.class, 123);
		sess.delete(job3);
		Transaction tx=sess.beginTransaction();
		tx.commit();
		
	}

}
