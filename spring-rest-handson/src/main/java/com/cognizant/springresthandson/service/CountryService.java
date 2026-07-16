package com.cognizant.springresthandson.service;

import com.cognizant.springresthandson.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;


import com.cognizant.springresthandson.model.Country;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    private List<Country> countries;

    // Load Country details from Spring Configuration XML during initialization
    @SuppressWarnings("unchecked")
    public CountryService() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        this.countries = (List<Country>) context.getBean("countryList");
    }

    // Returns the complete list of countries loaded from the context
    public List<Country> getAllCountries() {
        return countries;
    }

    // Dynamic stream query filtering data cache based on code matching
    public Country getCountryByCode(String code) throws Exception {
        return countries.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(() -> new Exception("Country Not Found for code: " + code));
    }
}