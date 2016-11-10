package org.arpit.java2blog.controller;

import org.arpit.java2blog.bean.EmployeeList;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class EmployeeUpdateController {

	/* EmployeeService employeeService = new EmployeeService();  
	
	@RequestMapping(value = "/employees", method = RequestMethod.GET,headers = "Accept=application/json")

	public EmployeeList getEmployeeList()//Map<String, Student>
	{
		System.out.println("ENTERED");
		return employeeService.getEmployees();
	}
*/
}
