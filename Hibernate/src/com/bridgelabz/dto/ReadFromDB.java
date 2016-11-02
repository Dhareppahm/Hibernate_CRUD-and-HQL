package com.bridgelabz.dto;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ReadFromDB {

public static void main(String[] args) {
	
	//1st componet
	Configuration cfg=new Configuration();
	cfg.configure();
	cfg.addAnnotatedClass(JobFairDTO.class);
	
	
	//2nd componet
	
	SessionFactory sf=cfg.buildSessionFactory();
	//3rd componet
	
	Session sess=sf.openSession();
	
	JobFairDTO job2=sess.load(JobFairDTO.class, 1234);
	System.out.println(job2.getCompanyName());
}

}