package com.github.gabrielfirmo.citiesapi.cities.repository;

import com.github.gabrielfirmo.citiesapi.cities.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
