package com.github.gabrielfirmo.citiesapi.states.repository;

import com.github.gabrielfirmo.citiesapi.states.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
