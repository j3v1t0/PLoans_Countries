package com.j3v1t0.springbootmicroserviceloancountries.service;

import com.j3v1t0.springbootmicroserviceloancountries.model.City;
import com.j3v1t0.springbootmicroserviceloancountries.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class CityServiceImpl implements CityService{

    @Autowired
    private CityRepository cityRepository;

    @Override
    public City saveCity(City city, String countryUuid){

        var cityUuid = UUID.randomUUID().toString();

        city.setCityUuid(cityUuid);
        city.setCityUuid(countryUuid);

        return cityRepository.save(city);
    }
    @Override
    public Optional<City> findByCityName(String cityName){
        return cityRepository.findByCityName(cityName);
    }

}
