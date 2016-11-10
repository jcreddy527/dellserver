package org.arpit.java2blog.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.arpit.java2blog.bean.Employee;
import org.arpit.java2blog.bean.EmployeeList;
import org.arpit.java2blog.bean.EmployeeUpdatList;
import org.arpit.java2blog.bean.EmployeeUpdate;
import org.arpit.java2blog.bean.Project;
import org.arpit.java2blog.bean.ProjectList;
import org.arpit.java2blog.bean.Task;
import org.arpit.java2blog.bean.TaskList;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository

public class ProjectService {
	
	
	
	
	 public Project addProject(SessionFactory sf,Project pro)  
	 {  
		 System.out.println(pro.toString());
		 sf.getCurrentSession().save(pro);
		 System.out.println("data saved success");
	  return pro;  
	 } 
	 
	 public void addTask(SessionFactory sf,Task task)  
	 {  
		 System.out.println(task.toString());
		 Project p  = sf.getCurrentSession().load(Project.class, task.getProject().getProID());
		 task.setProject(p);
		 sf.getCurrentSession().save(task);
		 System.out.println("data saved success");  
	 } 
	 
	 public EmployeeUpdate addEmp(SessionFactory sf,EmployeeUpdate emp)  
	 {  
		 sf.getCurrentSession().save(emp);
		 System.out.println("data saved success");
	  return emp;  
	 } 
	 
	 public ProjectList getProjects(SessionFactory sessionFactory)  {  
		
		 Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Project.class);	
	       //  criteria.setFetchMode("address", FetchMode.JOIN);
		        List list = criteria.list();
		        System.out.println("List"+list);
		        
		        Set<Project> l = new HashSet<Project>();
		        Project   e =null;
		        
		        Iterator i = list.iterator();
		        while(i.hasNext()){
		        		e = (Project)i.next();
		        
		        	  l.add(e);
		            }
		        ProjectList el = new ProjectList();
		        el.setProjects(l);
		    return el;   
	 }
	 
	 public TaskList getTasks(SessionFactory sessionFactory, int proid)  {  
		 
		 Query q=sessionFactory.getCurrentSession().createQuery("from Task where project.proID = "+proid); 	
		// Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Task.class);	
	       //  criteria.setFetchMode("address", FetchMode.JOIN);
		        List list = q.list();
		        System.out.println("List"+list);
		        
		        Set<Task> l = new HashSet<Task>();
		        Task   e =null;
		        
		        Iterator i = list.iterator();
		        while(i.hasNext()){
		        		e = (Task)i.next();
		        
		        	  l.add(e);
		            }
		        TaskList el = new TaskList();
		        el.setTasks(l);
		    return el;   
	 }
	 
 public TaskList getEmpTasks(SessionFactory sessionFactory, int empid)  {  
		 
		 Query q=sessionFactory.getCurrentSession().createQuery("from Task where emp.empid = "+empid); 	
		// Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Task.class);	
	       //  criteria.setFetchMode("address", FetchMode.JOIN);
		        List list = q.list();
		        System.out.println("List"+list);
		        
		        Set<Task> l = new HashSet<Task>();
		        Task   e =null;
		        
		        Iterator i = list.iterator();
		        while(i.hasNext()){
		        		e = (Task)i.next();
		        
		        	  l.add(e);
		            }
		        TaskList el = new TaskList();
		        el.setTasks(l);
		    return el;   
	 }
	
	 
	 public void taskUpdate(SessionFactory sessionFactory, int proid,int taskid,int empid)  {  
		 
		 String hql = "UPDATE Task set emp.empid = "  + empid+"WHERE taskId ="+taskid+" and project.proID="+proid;
	Query query = sessionFactory.getCurrentSession().createQuery(hql);
	int result = query.executeUpdate();
	System.out.println("Rows affected: " + result);
	 }
	 
	 
	 public EmployeeUpdatList getEmployees(SessionFactory sessionFactory)  {  
			
		 Criteria criteria = sessionFactory.getCurrentSession().createCriteria(EmployeeUpdate.class);	
	       //  criteria.setFetchMode("address", FetchMode.JOIN);
		        List list = criteria.list();
		        System.out.println("List"+list);
		        
		        Set<EmployeeUpdate> l = new HashSet<EmployeeUpdate>();
		        EmployeeUpdate   e =null;
		        
		        Iterator i = list.iterator();
		        while(i.hasNext()){
		        		e = (EmployeeUpdate)i.next();
		        
		        	  l.add(e);
		            }
		        EmployeeUpdatList el = new EmployeeUpdatList();
		        el.setEmployees(l);
		    return el;   
	 }
/*
	 public void deleteEmployee(SessionFactory sessionFactory,int id) 
	 {  
		 System.out.println("enterd into delete");
		 

Query query1 = sessionFactory.getCurrentSession().createQuery("delete from Department d where id="+id);
query1.executeUpdate();
Query query2 = sessionFactory.getCurrentSession().createQuery("delete from Address d where id="+id);
query2.executeUpdate();
Query query3 = sessionFactory.getCurrentSession().createQuery("delete from Employee d where id="+id);
query3.executeUpdate();

	System.out.println("student successfully deleted");
	    
	 }  


	public boolean validateEmployee(SessionFactory sessionFactory, Employee emp)  
	{  
		 
		 String hql = "FROM Employee E WHERE E.email ='"+emp.getEmail()+"' and E.pwd='"+emp.getPwd()+"'";
		 System.out.println(hql);
		 Query query = sessionFactory.getCurrentSession().createQuery(hql);
		 List results = query.list();
		 if(!results.isEmpty()){
			 System.out.println(true);
			 return true;
		 }else {
			 System.out.println(false);
			return false;
		}
		 
	}  


*/}
