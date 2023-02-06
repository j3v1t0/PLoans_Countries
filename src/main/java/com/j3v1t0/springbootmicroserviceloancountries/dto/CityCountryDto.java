package com.j3v1t0.springbootmicroserviceloancountries.dto;

import com.j3v1t0.springbootmicroserviceloancountries.model.Country;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CityCountryDto {

    private Country country;

}
