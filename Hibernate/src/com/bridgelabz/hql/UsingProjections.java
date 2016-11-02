package com.bridgelabz.hql;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;

import com.util.SingletonUtil;

public class UsingProjections {

public static void main(String[] args) {
		
		JobFairDTO job=new JobFairDTO();

		SessionFactory sf=SingletonUtil.getsf();
		
		
		Session sess=sf.openSession();
		
		
		Criteria  cri=sess.createCriteria(JobFairDTO.class);
		Projection pr=Projections.avg("jobId");
		cri.setProjection(pr);
		
		List l1=cri.list();
		System.out.println(l1);
	
}

}
