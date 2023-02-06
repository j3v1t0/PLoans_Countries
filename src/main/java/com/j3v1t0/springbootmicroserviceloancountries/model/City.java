package com.j3v1t0.springbootmicroserviceloancountries.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    public String cityUuid;
    @Column(name = "city_name", nullable = false)
    public String cityName;

    @Column(name = "city_abbreviation", nullable = false)
    private String cityAbbreviation;

/*    @Column(name = "country_uuid")
    private String countryUuid;*/

}
