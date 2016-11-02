package com.bridgelabz.hql;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.util.SingletonUtil;

public class Dyanmic {

	public static void main(String[] args) {
		
		
		 SessionFactory sf=SingletonUtil.getsf();
		 Session sess=sf.openSession();
		 
		 String hql="update JobFairDTO set designation=:d where jobId=:id";
		 Query qry=sess.createQuery(hql);
		 qry.setParameter("d", "DHM");
		 qry.setParameter("id",1237);
		 qry.executeUpdate();
		
		 Transaction tx=sess.beginTransaction();
		 tx.commit();
		 
	}
}
