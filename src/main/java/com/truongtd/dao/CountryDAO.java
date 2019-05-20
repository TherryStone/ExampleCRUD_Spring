package com.truongtd.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.truongtd.Util.CountryUntil;
import com.truongtd.model.Country;

@Repository
public class CountryDAO {

	@Autowired
	private SessionFactory factory;

	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	/**
	 * 
	 * @return
	 */
	public List<String> getAllCountries() {
		List<String> lstCountry = CountryUntil.session.createQuery("from country").list();
		return lstCountry;

	}

	/**
	 * 
	 * @param id
	 * @return
	 */
	public Country getCountry(int id) {
		Country country = (Country) CountryUntil.session.load(Country.class, new Integer(id));
		return country;
	}

	/**
	 * 
	 * @param country
	 * @return
	 */
	public Country addCountry(Country country) {
		CountryUntil.session.persist(country);
		return country;
	}

	/**
	 * 
	 * @param country
	 */
	public void updateCountry(Country country) {
		CountryUntil.session.update(country);
	}

	/**
	 * 
	 * @param id
	 */
	public void deleteCountry(int id) {
		Country country = (Country) CountryUntil.session.load(Country.class, new Integer(id));
		if (country != null) {
			CountryUntil.session.delete(country);
		}
	}

}
