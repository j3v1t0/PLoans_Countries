package com.j3v1t0.springbootmicroserviceloancountries.service;

import com.j3v1t0.springbootmicroserviceloancountries.dto.CityCountryDto;
import com.j3v1t0.springbootmicroserviceloancountries.model.Country;
import com.j3v1t0.springbootmicroserviceloancountries.model.CountryCityDto;

import java.util.Optional;

public interface CountryService {
    Country saveCountry(Country country);

    Country saveCity(CityCountryDto cityCountryDto, String countryUuid);

    Optional<Country> findByCountryName(String countryName);

    Optional<Country> findByCountryAbbreviation(String countryAbbreviarion);
}
