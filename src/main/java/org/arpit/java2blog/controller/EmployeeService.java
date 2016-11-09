package org.arpit.java2blog.controller;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.transaction.HeuristicMixedException;
import javax.transaction.HeuristicRollbackException;
import javax.transaction.RollbackException;
import javax.transaction.SystemException;
import javax.transaction.Transaction;

import org.arpit.java2blog.bean.Employee;
import org.arpit.java2blog.bean.EmployeeList;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


public class EmployeeService {
	
	 
	 public Employee addEmployee(SessionFactory sessionFactory, Employee emp)  
	 {  
		 sessionFactory.getCurrentSession().save(emp);
	  return emp;  
	 }  
	 
	 public EmployeeList getEmployees(SessionFactory sessionFactory)  {  
		 Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Employee.class);	
	       //  criteria.setFetchMode("address", FetchMode.JOIN);
		        List list = criteria.list();
		        System.out.println("List"+list);
		        
		        ArrayList<Employee> l = new ArrayList<Employee>();
		        Employee   e =null;
		        
		        Iterator i = list.iterator();
		        while(i.hasNext()){
		        		e = (Employee)i.next();
		        
		        	  l.add(e);
		            }
		        EmployeeList el = new EmployeeList();
		        el.setEmpList(l);
		    return el;   
	 }

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

}