package com.github.gabrielfirmo.citiesapi.distances;

import com.github.gabrielfirmo.citiesapi.distances.services.DistanceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/distances")
public class DistanceResource {

    private final DistanceService service;
    Logger log = LoggerFactory.getLogger(DistanceResource.class);

    public DistanceResource(DistanceService service) {
        this.service = service;
    }


    @GetMapping
    public ResponseEntity distance(@RequestParam(name = "from") final Long city1,
                                   @RequestParam(name = "to") final Long city2) {
        log.info("distance");
        return ResponseEntity.ok().body(service.distanceInKm(city1, city2));
    }

}