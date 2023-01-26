package com.j3v1t0.springbootmicroserviceloancountries.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

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
}
