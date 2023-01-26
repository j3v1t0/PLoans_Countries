package com.j3v1t0.springbootmicroserviceloancountries.controller;

import com.j3v1t0.springbootmicroserviceloancountries.model.Country;
import com.j3v1t0.springbootmicroserviceloancountries.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/country")
public class CountryController {

    @Autowired
    private CountryService countryService;

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
}
