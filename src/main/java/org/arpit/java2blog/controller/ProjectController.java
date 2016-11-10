package org.arpit.java2blog.controller;

import org.arpit.java2blog.bean.Employee;
import org.arpit.java2blog.bean.EmployeeList;
import org.arpit.java2blog.bean.EmployeeUpdatList;
import org.arpit.java2blog.bean.EmployeeUpdate;
import org.arpit.java2blog.bean.Project;
import org.arpit.java2blog.bean.ProjectList;
import org.arpit.java2blog.bean.Task;
import org.arpit.java2blog.bean.TaskList;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ProjectController {
	
	@Autowired
	 private SessionFactory sessionFactory;
	
	ProjectService ps = new ProjectService();
	
	@RequestMapping(value = "/project", method = RequestMethod.POST, headers = "Accept=application/json") 
	 @Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	 public Project addProject(@RequestBody Project pro) { 
		System.out.println("enterd from project");
	  return ps.addProject(sessionFactory, pro);  
	 } 
	
	@RequestMapping(value = "/task", method = RequestMethod.POST, headers = "Accept=application/json") 
	 @Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	 public void addTask(@RequestBody Task task) { 
		System.out.println("enterd from task");
	  ps.addTask(sessionFactory, task);  
	 } 
	@RequestMapping(value = "/empsave", method = RequestMethod.POST, headers = "Accept=application/json") 
	 @Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	 public EmployeeUpdate addEmp(@RequestBody EmployeeUpdate emp) { 
		System.out.println("enterd from emp");
	  return ps.addEmp(sessionFactory, emp);  
	 } 
	
	
	
	@RequestMapping(value = "/projects", method = RequestMethod.GET,headers = "Accept=application/json")

	public ProjectList getEmployeeList()//Map<String, Student>
	{
		System.out.println("ENTERED");
		return ps.getProjects(sessionFactory);
	}
	

	@RequestMapping(value = "/tasklist/{proid}", method = RequestMethod.GET,headers = "Accept=application/json")

	public TaskList getTasks(@PathVariable int proid)//Map<String, Student>
	{
		
		System.out.println(proid);
		return ps.getTasks(sessionFactory,proid);
	}
	
	@RequestMapping(value = "/emptasklist/{empid}", method = RequestMethod.GET,headers = "Accept=application/json")

	public TaskList getEmpTasks(@PathVariable int empid)//Map<String, Student>
	{
		
		System.out.println(empid);
		return ps.getEmpTasks(sessionFactory,empid);
	}
	@RequestMapping(value = "/taskUpdate/{proid}/{taskid}/{empid}", method = RequestMethod.GET,headers = "Accept=application/json")

	public void taskUpdate(@PathVariable int proid,@PathVariable int taskid,@PathVariable int empid)//Map<String, Student>
	{
		
		System.out.println(proid);
		ps.taskUpdate(sessionFactory,proid,taskid,empid);
	}
	
	@RequestMapping(value = "/emplist", method = RequestMethod.GET,headers = "Accept=application/json")

	public EmployeeUpdatList getEmployees()//Map<String, Student>
	{
		System.out.println("ENTERED");
		return ps.getEmployees(sessionFactory);
	}
	



}
