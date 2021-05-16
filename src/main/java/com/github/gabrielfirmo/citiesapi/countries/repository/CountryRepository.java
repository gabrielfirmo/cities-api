package com.github.gabrielfirmo.citiesapi.countries.repository;

import com.github.gabrielfirmo.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
