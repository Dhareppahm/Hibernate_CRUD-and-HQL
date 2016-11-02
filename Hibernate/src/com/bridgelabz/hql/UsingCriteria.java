package com.bridgelabz.hql;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.util.SingletonUtil;

public class UsingCriteria{

public static void main(String[] args) {
		
		JobFairDTO job=new JobFairDTO();

		SessionFactory sf=SingletonUtil.getsf();
		
		
		Session sess=sf.openSession();
		
		
		Criteria  cri=sess.createCriteria(JobFairDTO.class);
		List l1=cri.list();
		for (Object object : l1)
		{
			JobFairDTO job1=(JobFairDTO)object;
			System.out.println(job1.getCompanyName());
		}
	
}
}
