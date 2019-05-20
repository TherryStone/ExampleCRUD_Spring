package com.truongtd.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truongtd.dao.CountryDAO;
import com.truongtd.model.Country;

@Service("countryService")
public class CountryService {

	@Autowired
	CountryDAO countryDAO;

	@Transactional
	public List<String> getAllCountries() {
		return countryDAO.getAllCountries();
	}

	@Transactional
	public Country getCountry(int id) {
		return countryDAO.getCountry(id);
	}

	@Transactional
	public Country addCountry(Country country) {
		return countryDAO.addCountry(country);
	}
	
	@Transactional
	public void updateCountry(Country country) {
		countryDAO.updateCountry(country);
	}
	
	@Transactional
	public void deleteCountry(int id) {
		countryDAO.deleteCountry(id);
	}
}
