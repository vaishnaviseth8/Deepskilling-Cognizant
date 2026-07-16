package com.cognizant.ormlearn.repository;

import com.cognizant.ormlearn.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CountryRepository extends JpaRepository<Country, String> {

    // 1. Derived Query Method Feature: Find country based on exact code matching
    Optional<Country> findByCode(String code);

    // 2. Query Methods: Filter countries containing specific substring letters
    List<Country> findByNameContaining(String alphabet);

    // 3. Query Methods: Filter countries whose names start with specific characters
    List<Country> findByNameStartingWith(String prefix);

    // 4. Hibernate Query Language (HQL / JPQL Implementation)
    @Query("SELECT c FROM Country c WHERE c.name = :name")
    Optional<Country> findByNameUsingHql(@Param("name") String name);

    // 5. Native SQL Query Configuration
    @Query(value = "SELECT * FROM country WHERE co_name LIKE :pattern", nativeQuery = true)
    List<Country> findByNameLikeNative(@Param("pattern") String pattern);
}