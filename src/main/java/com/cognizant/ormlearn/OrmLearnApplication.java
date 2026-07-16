package com.cognizant.ormlearn;

import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class OrmLearnApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
    private static CountryService countryService;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(OrmLearnApplication.class, args);
        LOGGER.info("Inside main - Application Context Initialized");

        countryService = context.getBean(CountryService.class);

        try {
            LOGGER.info("[TEST EXECUTION] -> Fetching All Country Entities");
            List<Country> countries = countryService.getAllCountries();
            LOGGER.debug("Data Dump: {}", countries);

            LOGGER.info("[TEST EXECUTION] -> Finding Country By Unique Code");
            Country countryByCode = countryService.findCountryByCode("IN");
            LOGGER.debug("Found Entity: {}", countryByCode);

            LOGGER.info("[TEST EXECUTION] -> Appending New Country Entry");
            Country newCountry = new Country();
            newCountry.setCode("US");
            newCountry.setName("United States");
            countryService.addCountry(newCountry);
            LOGGER.info("Transaction Complete: 'US' safely added!");

            LOGGER.info("[TEST EXECUTION] -> Query Methods Filter - Substring Matching");
            List<Country> filteredCountries = countryService.findCountriesContaining("in");
            LOGGER.debug("Match Results: {}", filteredCountries);

            LOGGER.info("[TEST EXECUTION] -> Fetching Data Using HQL Logic");
            Country hqlCountry = countryService.findCountryByNameHql("India");
            LOGGER.debug("HQL Selection Response: {}", hqlCountry);

            LOGGER.info("[TEST EXECUTION] -> Fetching Data Using Native SQL Query");
            List<Country> nativeCountries = countryService.findCountriesNativeLike("%States%");
            LOGGER.debug("Native Response Array: {}", nativeCountries);

        } catch (Exception e) {
            LOGGER.error("Verification Exception triggered: ", e);
        }

        LOGGER.info("End of Main Logic Flow Thread");
    }
}