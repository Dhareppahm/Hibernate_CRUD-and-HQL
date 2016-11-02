package com.bridgelabz.hql;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.util.SingletonUtil;

public class Updatehql {

	public static void main(String[] args) {
		
		
		 SessionFactory sf=SingletonUtil.getsf();
		 Session sess=sf.openSession();
		 
		 String hql="update JobFairDTO set designation=? where jobId=?";
		 Query qry=sess.createQuery(hql);
		 qry.setString(0,"SE");
		 qry.setInteger(1, 1237);
		 qry.executeUpdate();
		
		  Transaction tx=sess.beginTransaction();
		 tx.commit();
		
		 
		
		 
	}

}
