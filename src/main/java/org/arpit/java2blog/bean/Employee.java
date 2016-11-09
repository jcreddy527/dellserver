package org.arpit.java2blog.bean;

import java.util.ArrayList;
import java.util.Collection;
import java.sql.Date;

import javax.xml.bind.annotation.XmlRootElement;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;

@Entity
@Table(name="emp")
@SecondaryTables({
    @SecondaryTable(name="address", pkJoinColumns={@PrimaryKeyJoinColumn(name="id") }),
    @SecondaryTable(name="department", pkJoinColumns={@PrimaryKeyJoinColumn(name="id") })})

@XmlRootElement(name="employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	
	private int id;

	@Column(name="name")
	private String name;

	@Column(name="email")
	private String email;
	
	@Column(name="password")
	private String pwd;

	@Column(name="phone")
	private String phone;

	@Column(name="doj")
	private Date doj;

	@Column(table="department",name="deptname")
	private String deptname;
	
	@Column(table="address",name="city")
	private String city;

	@Column(table="address",name="state")
	private String state;

	@Column(table="address",name="pincode")
	private int pincode;
	

	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String string) {
		this.phone = string;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date date) {
		this.doj = date;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", pwd=" + pwd + ", phone=" + phone
				+ ", doj=" + doj + ", deptname=" + deptname + ", city=" + city + ", state=" + state + ", pincode="
				+ pincode + "]";
	}


	
	
}
