package org.arpit.java2blog.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "task")
public class Task {
	
	 @Id
	 @Column(name = "task_id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int taskId;
	
	@Column(name = "task_tittle")
	private String tittle;
	
	@Column(name = "task_desc")
	private String description;
	
	@Column(name = "task_status")
	private String status;
	
	@ManyToOne
    @JoinColumn(name = "pro_id", nullable=false)
	private Project project;
	
	@ManyToOne
    @JoinColumn(name = "emp_id", nullable=true)
	private EmployeeUpdate emp;
	
	
	
	public EmployeeUpdate getEmp() {
		return emp;
	}
	public void setEmp(EmployeeUpdate emp) {
		this.emp = emp;
	}
	public int getTaskId() {
		return taskId;
	}
	public void setTaskId(int taskId) {
		this.taskId = taskId;
	}
	public String getTittle() {
		return tittle;
	}
	public void setTittle(String tittle) {
		this.tittle = tittle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Project getProject() {
		return project;
	}
	public void setProject(Project project) {
		this.project = project;
	}



}
