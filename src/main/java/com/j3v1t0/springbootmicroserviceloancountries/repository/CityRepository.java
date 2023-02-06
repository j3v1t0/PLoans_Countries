package com.j3v1t0.springbootmicroserviceloancountries.repository;

import com.j3v1t0.springbootmicroserviceloancountries.model.City;
import com.j3v1t0.springbootmicroserviceloancountries.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CityRepository extends JpaRepository<City, String> {

    Optional<City> findByCityName(String cityName);

    Optional<City> findByCityAbbreviation(String cityAbbreviation);
}
