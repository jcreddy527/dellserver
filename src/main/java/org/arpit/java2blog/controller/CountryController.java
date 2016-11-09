package org.arpit.java2blog.controller;

import java.util.ArrayList;
import java.util.List;

import org.arpit.java2blog.bean.Country;
import org.arpit.java2blog.bean.CountryList;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class CountryController {
	
	@Autowired
	 private SessionFactory sessionFactory;
	
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/countries", method = RequestMethod.GET,headers="Accept=application/json")
	public CountryList getCountries()
	{
		try {
			/*Criteria crit = sessionFactory.getCurrentSession().createCriteria(Country.class);
			crit.add(Restrictions.eq("countryname","India"));
			*/
			Query crit = sessionFactory.getCurrentSession().createQuery("from Country");
			
			List<Country> results = crit.list();
			System.out.println(results.size());
			System.out.println(results);
			CountryList c = new   CountryList();
			c.setCountryList(results);

		//	System.out.println(new Gson().toJson(results.get(0)));
			return c;
		} catch (HibernateException e) {
			//e.printStackTrace();
			return null;
		} catch (Exception e) {
			System.out.println("Error: "+e.getMessage());
			return null;
		}
	}

	
	@SuppressWarnings("rawtypes")
	public List<Country> getCountry(List list){
		
		ArrayList<Country> al = new ArrayList<Country>();
			java.util.Iterator i = list.iterator();
			while(i.hasNext()){
				Country o = (Country)i.next();
		/*	Set<State> states = new HashSet<State>();
				
				//System.out.println(o.getStates());
				
				java.util.Iterator<State> ss = o.getStates().iterator();
			*/
			/*	while(ss.hasNext()){
					State s = ss.next();
					s.setId(s.getId());
					s.setStatename(s.getStatename());
				s.setCities(s.getCities());
				
					Set cities = new HashSet<City>();
					
					java.util.Iterator<City> cc = s.getCities().iterator();
					while(cc.hasNext()){
						City city = cc.next();
						city.setCityname(city.getCityname());
						city.setId(city.getId());
						cities.add(city);
					}
				*/	//states.add(s);	
			/*	}
				StateList sl = new StateList();
				sl.add
				c.setCountryname(o.getCountryname());
				c.setId(o.getId());
				c.setStates(sl);
				
				al.add(c);
			}*/
				
		
	}
			return al;
	}

}
