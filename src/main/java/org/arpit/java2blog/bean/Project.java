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
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "project")
public class Project {
	
	 @Id
	 @Column(name = "pro_id")
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int proID;
	 
	@Column(name = "project_name")
	private String proName;
	
	public int getProID() {
		return proID;
	}
	public void setProID(int proID) {
		this.proID = proID;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	@Override
	public String toString() {
		return "Project [proID=" + proID + ", proName=" + proName + "]";
	}

	
}
