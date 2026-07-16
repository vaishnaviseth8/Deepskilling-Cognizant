package com.cognizant.ormlearn.service;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.repository.CountryRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {

    @Autowired
    private CountryRepository countryRepository;

    @Transactional
    public List<Country> getAllCountries() {
        return countryRepository.findAll();
    }

    // Action: Find Country By Code
    @Transactional
    public Country findCountryByCode(String code) throws Exception {
        return countryRepository.findByCode(code)
                .orElseThrow(() -> new Exception("Country Not Found for code: " + code));
    }

    // Action: Add A New Country
    @Transactional
    public void addCountry(Country country) {
        countryRepository.save(country);
    }

    // Action: Find Countries Containing Substring
    @Transactional
    public List<Country> findCountriesContaining(String match) {
        return countryRepository.findByNameContaining(match);
    }

    // Action: Find Countries Starting With Character
    @Transactional
    public List<Country> findCountriesStartingWith(String prefix) {
        return countryRepository.findByNameStartingWith(prefix);
    }

    // Action: Find Country Using HQL Query
    @Transactional
    public Country findCountryByNameHql(String name) throws Exception {
        return countryRepository.findByNameUsingHql(name)
                .orElseThrow(() -> new Exception("Country Not Found with name: " + name));
    }

    // Action: Find Countries Using Native SQL Query
    @Transactional
    public List<Country> findCountriesNativeLike(String pattern) {
        return countryRepository.findByNameLikeNative(pattern);
    }
}