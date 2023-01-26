package com.j3v1t0.springbootmicroserviceloancountries.service;

import com.j3v1t0.springbootmicroserviceloancountries.model.Country;

import java.util.Optional;

public interface CountryService {
    Country saveCountry(Country country);

    Optional<Country> findByCountryName(String countryName);

    Optional<Country> findByCountryAbbreviation(String countryAbbreviarion);
}
