package com.bridgelabz.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.util.SingletonUtil;

public class UsingSingleton {

	public static void main(String[] args) {
		
	JobFairDTO job4=new JobFairDTO();
	job4.setCompanyName("Google");
	job4.setDesignation("TSE");
	
	//using singleton class,instance of SessionFactory
	SessionFactory sf=SingletonUtil.getsf();
	Session sess=sf.openSession();
	sess.save(job4);
	sess.beginTransaction().commit();
	
		
	}

}