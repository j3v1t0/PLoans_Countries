package com.j3v1t0.springbootmicroserviceloancountries.service;

import com.j3v1t0.springbootmicroserviceloancountries.model.City;

import java.util.Optional;

public interface CityService {
    City saveCity(City city, String countryUuid);

    Optional<City> findByCityName(String cityName);
}
