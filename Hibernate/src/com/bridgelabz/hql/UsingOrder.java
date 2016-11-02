package com.bridgelabz.hql;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import com.util.SingletonUtil;

public class UsingOrder {

public static void main(String[] args) {
		
		JobFairDTO job=new JobFairDTO();

		SessionFactory sf=SingletonUtil.getsf();
		
		
		Session sess=sf.openSession();
		
		
		Criteria  cri=sess.createCriteria(JobFairDTO.class);
	    Order or=Order.desc("jobId");
	    cri.setFirstResult(3);
	    cri.setMaxResults(2);
	    cri.addOrder(or);
		
		List l1=cri.list();
		for (Object object : l1) {
			JobFairDTO job1=(JobFairDTO)object;
			System.out.println(job1.getJobId());
		}
		//System.out.println(l1);
	
}


}
