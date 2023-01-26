package com.j3v1t0.springbootmicroserviceloancountries.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "country")
public class Country {
    @Id
    private String countryUuid;
    @Column(name = "country_name", nullable = false, unique = true)
    private String countryName;
    @Column(name = "country_abbreviation", nullable = false, unique = true)
    private String countryAbbreviation;

    @OneToMany(targetEntity = City.class,cascade = CascadeType.ALL)
    @JoinColumn(name ="country_uuid",referencedColumnName = "countryUuid")
    private List<City> cityList;
}
