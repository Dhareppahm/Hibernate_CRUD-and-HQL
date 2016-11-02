package com.bridgelabz.hql;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.util.SingletonUtil;

public class CriteriaDAO {

	public static void main(String[] args) {
		
		JobFairDTO job=new JobFairDTO();

		SessionFactory sf=SingletonUtil.getsf();
		
		
		Session sess=sf.openSession();
		
		
		Criteria  cri=sess.createCriteria(JobFairDTO.class);
	
			cri.setFirstResult(1);
			cri.setMaxResults(10);
/*		Criterion crit=Restrictions.eq("designation", "Trainee engineer");
		cri.add(crit);
*/		
		/*Projection pro=Projections.avg("jobID");
		
		cri.setProjection(pro);
		*/
		
		
		/*Order ord=Order.desc("jobID");
		
		cri.addOrder(ord);
		
	*/
		
		
		
		
		
		
		
		
		List<JobFairDTO> l1=cri.list();
		
		System.out.println(l1.size());
		
		
	}

}