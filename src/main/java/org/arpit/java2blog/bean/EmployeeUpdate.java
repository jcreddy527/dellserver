package org.arpit.java2blog.bean;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "empupdate")
public class EmployeeUpdate {
	
	@Id
	 @Column(name = "emp_id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int empid;
	
	@Column(name = "emp_name")
	private String name;
		 
	@Column(name = "emp_email")
	private String email;
		 
	@Column(name = "emp_today")
	private String today;
		 
	@Column(name = "emp_yesterday")
	private String yesterday;
		 
	@Column(name = "emp_issues")
	private String issues;
	
	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getToday() {
		return today;
	}

	public void setToday(String today) {
		this.today = today;
	}

	public String getYesterday() {
		return yesterday;
	}

	public void setYesterday(String yesterday) {
		this.yesterday = yesterday;
	}

	public String getIssues() {
		return issues;
	}

	public void setIssues(String issues) {
		this.issues = issues;
	}

	
	
	
	

}
