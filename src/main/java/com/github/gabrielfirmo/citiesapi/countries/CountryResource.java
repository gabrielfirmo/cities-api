package com.github.gabrielfirmo.citiesapi.countries;

import com.github.gabrielfirmo.citiesapi.countries.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController
@RequestMapping("/countries")
public class CountryResource {


    /* Alternativa ao @Autowired
    public CountryResource(CountryRepository repository) {
        this.repository = repository;
    }
    */
    @Autowired
    private CountryRepository repository;

    @GetMapping
    public Page<Country> countries(Pageable page){
        return repository.findAll(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity getOne(@PathVariable Long id){
        Optional<Country> optional = repository.findById(id);

        if (optional.isPresent()){
            return ResponseEntity.ok().body(optional.get());
        }
        else{
            return ResponseEntity.notFound().build();
        }

    }

}
