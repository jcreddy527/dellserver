package org.arpit.java2blog.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.bind.annotation.XmlRootElement;

import org.arpit.java2blog.bean.Address;
import org.arpit.java2blog.bean.CustomertMap;
import org.arpit.java2blog.bean.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class StudentController{
	
	/*@RequestMapping(value = "/students", method = RequestMethod.GET,produces="application/xml")

	public List<Student> getStudents ()
	{
		List<Student> listOfStudents = new ArrayList<Student>();
		listOfStudents=StudentList();
		return listOfStudents;
	}
	
	@RequestMapping(value = "/student", method = RequestMethod.GET,produces="application/xml")
	public CustomertMap getStudentsAndKey()//Map<String, Student>
	{
		//List<Student> listOfStudents = new ArrayList<Student>();
		//Map<String, List> map = new HashMap<String,List>();
		//map.put("student1", listOfStudents);
	
		//listOfStudents=StudentList();
		//Student s1 = new Student(101,"jaya","jcreddy527@gmail.com","12345",new Address("bangalore","karnataka","560029"));
		//Student s1 = new Student(101,"jaya","jcreddy527@gmail.com","12345",new Address("bangalore","karnataka","560029"));
		//Student s2 = new Student(102,"jaya","jcreddy527@gmail.com","12345",new Address("bangalore","karnataka","560029"));
		CustomertMap cusMap = new CustomertMap();
		cusMap.setAddressMap(StudentListAll());
		return cusMap;*/
	}
	
	/*public List<Student> StudentList()
	{
		
		
		Student s1 = new Student(101,"jaya","jcreddy527@gmail.com","12345",new Address("bangalore","karnataka","560029"));
		Student s2 = new Student(102,"jaya","jcreddy527@gmail.com","12345",new Address("bangalore","karnataka","560029"));
		Student s3 = new Student(103,"jaya","jcreddy527@gmail.com","12345",new Address("bangalore","karnataka","560029"));
		Student s4 = new Student(104,"jaya","jcreddy527@gmail.com","12345",new Address("bangalore","karnataka","560029"));
		Student s5 = new Student(105,"jaya","jcreddy527@gmail.com","12345",new Address("bangalore","karnataka","560029"));
		Student s6 = new Student(106,"jaya","jcreddy527@gmail.com","12345",new Address("bangalore","karnataka","560029"));
		Student s7 = new Student(107,"jaya","jcreddy527@gmail.com","12345",new Address("bangalore","karnataka","560029"));
		
		List<Student> listOfStudents = new ArrayList<Student>();
		listOfStudents.add(s1);
		listOfStudents.add(s2);
		listOfStudents.add(s3);
		listOfStudents.add(s4);
		listOfStudents.add(s5);
		listOfStudents.add(s6);
		listOfStudents.add(s7);
		return listOfStudents;
	}

	public Map<String, Student> StudentListAll()
	{
		
		Student s1 = new Student(101,"jaya","jcreddy527@gmail.com","12345",new Address("bangalore","karnataka","560029"));
		Student s2 = new Student(102,"jaya","jcreddy527@gmail.com","12345",new Address("bangalore","karnataka","560029"));
		Student s3 = new Student(103,"jaya","jcreddy527@gmail.com","12345",new Address("bangalore","karnataka","560029"));
		Student s4 = new Student(104,"jaya","jcreddy527@gmail.com","12345",new Address("bangalore","karnataka","560029"));
		Student s5 = new Student(105,"jaya","jcreddy527@gmail.com","12345",new Address("bangalore","karnataka","560029"));
		Student s6 = new Student(106,"jaya","jcreddy527@gmail.com","12345",new Address("bangalore","karnataka","560029"));
		Student s7 = new Student(107,"jaya","jcreddy527@gmail.com","12345",new Address("bangalore","karnataka","560029"));
		
		Map<String, Student> listOfStudentsall = new TreeMap<String, Student>();
		
		listOfStudentsall.put("student1", s1);
		listOfStudentsall.put("student2", s2);
		listOfStudentsall.put("student3", s3);
		listOfStudentsall.put("student4", s4);
		listOfStudentsall.put("student5", s5);
		listOfStudentsall.put("student6", s6);
		listOfStudentsall.put("student7", s7);
		return listOfStudentsall;
	}
*/

