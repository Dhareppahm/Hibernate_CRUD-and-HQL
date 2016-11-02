package com.bridgelabz.hql;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.util.SingletonUtil;

public class UsingHQL {

	public static void main(String[] args) {
		
		
		
		 SessionFactory sf=SingletonUtil.getsf();
		 Session sess=sf.openSession();
		 String hql="from JobFairDTO where jobId='1237'";
		 
		 //prepare/create the query
		 
		 org.hibernate.Query qry=sess.createQuery(hql);
		 
		 //process the query result
		 JobFairDTO job1=(JobFairDTO)qry.uniqueResult();
		 System.out.println(job1.getCompanyName());
	}

}
