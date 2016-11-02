package com.bridgelabz.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.util.SingletonUtil;

public class SelectParticularRecord {

public static void main(String[] args) {
		
		
		 SessionFactory sf=SingletonUtil.getsf();
		 Session sess=sf.openSession();
		 String hql="select companyName from JobFairDTO where jobId='1237'";
		 
		 //prepare/craete the query
		 
		 org.hibernate.Query qry=sess.createQuery(hql);
		 
		 //process the query result
		 String companyName=(String)qry.uniqueResult();
		 System.out.println(companyName);
	}

}
