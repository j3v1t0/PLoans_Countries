package com.j3v1t0.springbootmicroserviceloancountries.repository;

import com.j3v1t0.springbootmicroserviceloancountries.model.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, String> {

}
