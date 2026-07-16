
package com.cognizant.ormlearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class JpaDifferenceInfo implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(JpaDifferenceInfo.class);

    @Override
    public void run(String... args) throws Exception {
        LOGGER.info("========================================================================");
        LOGGER.info("[CONCEPTUAL EXPLANATION] -> Core Differences: JPA vs Hibernate vs Spring Data JPA");
        LOGGER.info("========================================================================");

        // 1. JPA Core Logic Explanation
        LOGGER.info("[1. JPA - Java Persistence API]");
        LOGGER.info("   - It is strictly a Specification / Interface (Rules, guidelines, and standards).");
        LOGGER.info("   - It provides no actual engine, just standard annotations under 'jakarta.persistence.*' (like @Entity, @Id).");

        // 2. Hibernate Core Logic Explanation
        LOGGER.info("[2. Hibernate ORM Framework]");
        LOGGER.info("   - It is the actual Implementation (Provider) of the JPA specifications.");
        LOGGER.info("   - It acts as the underlying engine that listens to JPA rules, connects to the database, and executes actual SQL queries.");

        // 3. Spring Data JPA Core Logic Explanation
        LOGGER.info("[3. Spring Data JPA]");
        LOGGER.info("   - It is an Abstraction Layer provided by the Spring Framework built on top of the JPA provider.");
        LOGGER.info("   - It eliminates standard boilerplate code by providing built-in repository functions (like 'findAll()' and 'save()').");

        LOGGER.info("------------------------------------------------------------------------");
        LOGGER.info("Analogy Example: JPA is a Recipe Book, Hibernate is the actual Chef who cooks the meal, and Spring Data JPA is the Food Delivery App where you order with a single click!");
        LOGGER.info("========================================================================");
    }
}