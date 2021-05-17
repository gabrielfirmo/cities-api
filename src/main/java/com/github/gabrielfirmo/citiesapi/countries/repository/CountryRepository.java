package com.github.gabrielfirmo.citiesapi.countries.repository;

import com.github.gabrielfirmo.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface CountryRepository extends JpaRepository<Country, Long> {

}
