package com.bridgelabz.hql;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.util.SingletonUtil;


public class Placeholder {

	public static void main(String[] args) {
		
		
		 SessionFactory sf=SingletonUtil.getsf();
		 Session sess=sf.openSession();
		 
		 String hql="from JobFairDTO where jobId=?";
		 Query qry=sess.createQuery(hql);
		 qry.setInteger(0, 1237);
	     JobFairDTO job1=(JobFairDTO)qry.uniqueResult();
		 System.out.println(job1.getDesignation());
		  
	}

}
