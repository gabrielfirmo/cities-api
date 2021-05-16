package com.github.gabrielfirmo.citiesapi.distances.services;

import com.github.gabrielfirmo.citiesapi.cities.City;
import com.github.gabrielfirmo.citiesapi.cities.repository.CityRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.geo.Point;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DistanceService {

    private final CityRepository cityRepository;
    Logger log = LoggerFactory.getLogger(DistanceService.class);

    public DistanceService(final CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public Double distanceInKm(Long city1, Long city2) {
        log.info("distanceInKm({}, {})", city1, city2);
        final List<City> cities = cityRepository.findAllById((Arrays.asList(city1, city2)));

        Point p1 = cities.get(0).getLocation();
        Point p2 = cities.get(1).getLocation();

        return cityRepository.distanceInKm(p1.getX(), p1.getY(), p2.getX(), p2.getY())/1000;
    }

}