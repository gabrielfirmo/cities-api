package com.github.gabrielfirmo.citiesapi.cities;

import com.github.gabrielfirmo.citiesapi.states.State;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;

@Entity
@Table(name = "cidade")

public class City {

    @Id
    private Long id;

    @Column(name = "nome")
    private String name;


    @ManyToOne
    @JoinColumn(name="uf", referencedColumnName = "id")
    private State state;

    private Integer ibge;

    // 1st
    @Column(name = "lat_lon")
    private String geolocation;


    public City() {
    }



    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }



    public State getState() {
        return state;
    }

    public Integer getIbge() {
        return ibge;
    }

    public String getGeolocation() {
        return geolocation;
    }


}