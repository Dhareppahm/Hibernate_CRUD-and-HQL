package com.bridgelabz.hql;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.util.SingletonUtil;
public class SelectAll {

	public static void main(String[] args) {
		
		
		 SessionFactory sf=SingletonUtil.getsf();
		 Session sess=sf.openSession();
		 String hql=" from JobFairDTO";
		 
		 //prepare/create the query
		 
		 Query qry=sess.createQuery(hql);
		 
		 //process the query result
		 List l1=qry.list();
		 for (Object object : l1) {
			JobFairDTO job=(JobFairDTO)object; 
			System.out.println(job.getJobId());
			System.out.println(job.getCompanyName());
			System.out.println(job.getDesignation());
		}
			// System.out.println(obj[0]);
			// System.out.println(obj[1]);
	}
}
