package org.arpit.java2blog.bean;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="employee")
//@XmlAccessorType(XmlAccessType.FIELD)
public class Student {
	//@XmlElement
	private int sid;
	//@XmlElement
	private String name;
	//@XmlElement
	private String email;
	//@XmlElement
	private String password;
	//@XmlElement
	private Address address;

	
	
	public Student() {
		super();
	}

	public Student(int sid, String name, String email, String password, Address address) {
		super();
		this.sid = sid;
		this.name = name;
		this.email = email;
		this.password = password;
		this.address = address;

	}
	
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
}
