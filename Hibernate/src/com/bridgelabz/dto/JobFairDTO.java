package com.bridgelabz.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="job_table1")
public class JobFairDTO implements Serializable{
@GenericGenerator(name="gene",strategy="increment")
@GeneratedValue(generator="gene")
  @Id
  @Column(name="job_id")
	private int jobId;
  @Column(name="company_name")
	private String companyName;
  @Column(name="com_designation")
	private String designation;
	 public JobFairDTO() {
		 
	 }
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
		this.jobId = jobId;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}

}
