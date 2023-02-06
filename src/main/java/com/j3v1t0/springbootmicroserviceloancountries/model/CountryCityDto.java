package com.j3v1t0.springbootmicroserviceloancountries.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CountryCityDto {

    private Country country;

}
