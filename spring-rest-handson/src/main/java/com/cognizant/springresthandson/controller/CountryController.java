package com.cognizant.springresthandson.controller;

import com.cognizant.springresthandson.model.Country;
import com.cognizant.springresthandson.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    // Handles resource requests to fetch the complete collections layer
    @GetMapping("/countries")
    public List<Country> getAllCountries() {
        return countryService.getAllCountries();
    }

    // Captures path variables dynamically to query a singular matched object
    @GetMapping("/countries/{code}")
    public Country getCountryByCode(@PathVariable("code") String code) throws Exception {
        return countryService.getCountryByCode(code);
    }
}
