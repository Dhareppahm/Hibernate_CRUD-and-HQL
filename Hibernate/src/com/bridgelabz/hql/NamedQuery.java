package com.bridgelabz.hql;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.util.SingletonUtil;

public class NamedQuery {

	public static void main(String[] args) {
		
		
		 SessionFactory sf=SingletonUtil.getsf();
		 Session sess=sf.openSession();
		 
		Query qry1=sess.getNamedQuery("findById");
		qry1.setParameter("id", 1237);
		//qry.uniqueResult();
		JobFairDTO j=(JobFairDTO)qry1.uniqueResult();
		System.out.println(j.getDesignation());
		Query qry2=sess.getNamedQuery("findByName");
		JobFairDTO jj=(JobFairDTO)qry2.uniqueResult();
		System.out.println(jj.getDesignation());
	}

}
