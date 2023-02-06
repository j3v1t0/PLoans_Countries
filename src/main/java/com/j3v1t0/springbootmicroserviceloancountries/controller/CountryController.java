package com.j3v1t0.springbootmicroserviceloancountries.controller;

import com.j3v1t0.springbootmicroserviceloancountries.dto.CityCountryDto;
import com.j3v1t0.springbootmicroserviceloancountries.model.City;
import com.j3v1t0.springbootmicroserviceloancountries.model.Country;
import com.j3v1t0.springbootmicroserviceloancountries.model.CountryCityDto;
import com.j3v1t0.springbootmicroserviceloancountries.service.CityService;
import com.j3v1t0.springbootmicroserviceloancountries.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/country")
public class CountryController {

    @Autowired
    private CountryService countryService;

    @Autowired
    private CityService cityService;

    @PostMapping("saveCountry")
    public ResponseEntity<?> saveCountry(@RequestBody Country country){

        if(countryService.findByCountryName(country.getCountryName()).isPresent()){
            return new ResponseEntity<>("Country is already registered!", HttpStatus.CONFLICT);
        }

        if(countryService.findByCountryAbbreviation(country.getCountryAbbreviation()).isPresent()){
            return new ResponseEntity<>("Country abbreviation is already registered!", HttpStatus.CONFLICT);
        }

        return new ResponseEntity<>(countryService.saveCountry(country), HttpStatus.CREATED);

    }

    @PutMapping("saveCity/{countryUuid}")
    public ResponseEntity<?> saveCity(@PathVariable String countryUuid, @RequestBody CityCountryDto cityCountryDto){
        return new ResponseEntity<>(countryService.saveCity(cityCountryDto, countryUuid), HttpStatus.CREATED);
    }
}
