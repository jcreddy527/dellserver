package org.arpit.java2blog.bean;

import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name = "country")
public class Country {
	
	 @Id
	  @Column(name = "cid")
	  @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	 
	  @Column(name = "Cname")
	private String countryname;
	  
	  @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	  @JoinTable(
	             name="country_state",
	             joinColumns = @JoinColumn( name="cid"),
	             inverseJoinColumns = @JoinColumn( name="sid")
	     )
		private Set<State> states;
	
	  
	
	@Override
	public String toString() {
		return "Country [id=" + id + ", countryname=" + countryname + ", states=" + states + "]";
	}

	public Country(String countryname, Set<State> states) {
		super();
		this.countryname = countryname;
		this.states = states;
	}
	
	public Country() {
	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public Set<State> getStates() {
		return states;
	}
	public void setStates(Set<State> states) {
		this.states = states;
	}

	
	
}
