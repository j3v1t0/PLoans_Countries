package com.j3v1t0.springbootmicroserviceloancountries.repository;

import com.j3v1t0.springbootmicroserviceloancountries.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CountryRepository extends JpaRepository<Country, String> {

    Optional<Country> findByCountryName(String countryName);

    Optional<Country> findByCountryAbbreviation(String countryAbbreviation);
}
