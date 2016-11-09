package org.arpit.java2blog.bean;

import javax.persistence.*;

@Entity
@Table(name = "city")
public class City {
	
	 @Override
	public String toString() {
		return "City [id=" + id + ", cityname=" + cityname + "]";
	}

	@Id
	  @Column(name = "cityid")
	  @GeneratedValue
	private int id;
	  @Column(name = "cityname")
	private String cityname;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCityname() {
		return cityname;
	}

	public void setCityname(String cityname) {
		this.cityname = cityname;
	}


	public City(String cityname) {
		super();
		this.cityname = cityname;

	}
	
	public City() {
	
	}
	  
	
}
