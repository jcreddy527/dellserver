package org.arpit.java2blog.bean;

import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "state")
public class State {
	
	  @Id
	  @Column(name = "sid")
	  @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	  
	  @Column(name = "sname")
	private String statename;
	
	  @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	  @JoinTable(
	             name="state_city",
	             joinColumns = @JoinColumn( name="sid"),
	             inverseJoinColumns = @JoinColumn( name="cityid")
	     )
		private Set<City> cities;
	

	public int getId() {
		return id;
	}

	public Set<City> getCities() {
		return cities;
	}

	public void setCities(Set<City> cities) {
		this.cities = cities;
	}

	@Override
	public String toString() {
		return "State [id=" + id + ", statename=" + statename + ", cities=" + cities + "]";
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatename() {
		return statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public State(String statename,Set<City> cities) {
		super();
		this.cities = cities;
		this.statename = statename;
	}

	public State() {
		
	}
}
