package com.j3v1t0.springbootmicroserviceloancountries.service;

import com.j3v1t0.springbootmicroserviceloancountries.model.Country;
import com.j3v1t0.springbootmicroserviceloancountries.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class CountryServiceImpl implements CountryService{

    @Autowired
    private CountryRepository countryRepository;
    @Override
    public Country saveCountry(Country country){

        var countryUuid = UUID.randomUUID().toString();

        country.setCountryUuid(countryUuid);

        return countryRepository.save(country);
    }

    @Override
    public Optional<Country> findByCountryName(String countryName){
        return countryRepository.findByCountryName(countryName);
    }

    @Override
    public Optional<Country> findByCountryAbbreviation(String countryAbbreviarion){
        return countryRepository.findByCountryAbbreviation(countryAbbreviarion);
    }
}
