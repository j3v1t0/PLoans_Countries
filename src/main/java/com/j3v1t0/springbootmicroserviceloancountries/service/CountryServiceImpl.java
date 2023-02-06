package com.j3v1t0.springbootmicroserviceloancountries.service;

import com.j3v1t0.springbootmicroserviceloancountries.dto.CityCountryDto;
import com.j3v1t0.springbootmicroserviceloancountries.model.Country;
import com.j3v1t0.springbootmicroserviceloancountries.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
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

        //Optional<Country> findCountry = countryRepository.findByCountryName(country.getCountryName());
        //Optional<Country> findCountryAbbreviation = countryRepository.findByCountryAbbreviation(country.getCountryAbbreviation());

        country.setCountryUuid(countryUuid);

        return countryRepository.save(country);
    }

    @Override
    public Country saveCity(CityCountryDto cityCountryDto, String countryUuid){

        return countryRepository.findById(countryUuid)
                .map( country -> {
                    country.setCityList(cityCountryDto.getCountry().getCityList());
                    return countryRepository.save(country);
                }).orElseThrow(()->new UsernameNotFoundException(countryUuid));

    }

    @Override
    public Optional<Country> findByCountryName(String countryName){
        return countryRepository.findByCountryName(countryName);
    }

    @Override
    public Optional<Country> findByCountryAbbreviation(String countryAbbreviation){
        return countryRepository.findByCountryAbbreviation(countryAbbreviation);
    }
}
