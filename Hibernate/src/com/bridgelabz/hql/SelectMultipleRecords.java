package com.bridgelabz.hql;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.util.SingletonUtil;
public class SelectMultipleRecords {

	public static void main(String[] args) {
		
		
		 SessionFactory sf=SingletonUtil.getsf();
		 Session sess=sf.openSession();
		 String hql="select companyName,designation from JobFairDTO where jobId='1237'";
		 
		 //prepare/create the query
		 
		 org.hibernate.Query qry=sess.createQuery(hql);
		 
		 //process the query result
		 Object[] obj=(Object[])qry.uniqueResult();
		// System.out.println(obj[0]);
		// System.out.println(obj[1]);
		 for (int i = 0; i < obj.length; i++)
		 {
			System.out.println(obj[i]);
		}
	}

}
