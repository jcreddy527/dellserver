package org.arpit.java2blog.controller;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.arpit.java2blog.bean.CustomertMap;
import org.arpit.java2blog.bean.Employee;
import org.arpit.java2blog.bean.Address;
import org.arpit.java2blog.bean.Department;
import org.arpit.java2blog.bean.EmployeeList;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class EmployeeController {
	
	@Autowired
	 private SessionFactory sessionFactory;
	
	 EmployeeService employeeService = new EmployeeService();  
	
	@RequestMapping(value = "/employees", method = RequestMethod.GET,headers = "Accept=application/json")

	public EmployeeList getEmployeeList()//Map<String, Student>
	{
		System.out.println("ENTERED");
		return employeeService.getEmployees(sessionFactory);
	}
	
	 @RequestMapping(value = "/employees", method = RequestMethod.POST, headers = "Accept=application/json") 
	 @Transactional(propagation = Propagation.SUPPORTS, readOnly = false)
	 public Employee addEmployee(@RequestBody Employee emp) { 
		 System.out.println(emp.toString());
		 System.out.println("@@@@@@@"+emp.getCity());
		 
	  return employeeService.addEmployee(sessionFactory,emp);  
	 } 
	 
	 @RequestMapping(value = "/employees", method = RequestMethod.PUT, headers = "Accept=application/json")  
	 public Employee updateEmployee(@RequestBody Employee emp) {  
	  return employeeService.addEmployee(sessionFactory,emp);  
	  
	 }  
	  
	 @RequestMapping(value = "/employees/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")  
	 public void deleteCountry(@PathVariable int id) {  
		 employeeService.deleteEmployee(sessionFactory,id);  

	 }
	 
	 @RequestMapping(value = "/employee", method = RequestMethod.GET,produces = "text/plain")  
	 public String getValue() {  
	
		return "I am from employee class";  

	 }
	 
	 @SuppressWarnings("deprecation")
	@RequestMapping(value = "/employe", method = RequestMethod.GET,headers = "Accept=application/json")  
	 public Employee employee() {  
		 
		 Employee e = new Employee();
		 e.setCity("Bangalore");
		 e.setDeptname("police");
		 e.setDoj(new java.sql.Date(2016, 9, 29));
		 e.setEmail("jcreddy527@gmail.com");
		 e.setName("jayachandra reddy");
		 e.setPhone("9739030829");
		 e.setPincode(517421);
		 e.setPwd("2312323");
		 e.setState("karnataka");
		 
		return e ;  

	 }
	
	 @RequestMapping(value = "/employeevalidate", method = RequestMethod.POST,headers = "Accept=application/json") 
	 public boolean employeeValidate(@RequestBody Employee emp) { 
	 
	  return employeeService.validateEmployee(sessionFactory,emp);  
	 } 
}
