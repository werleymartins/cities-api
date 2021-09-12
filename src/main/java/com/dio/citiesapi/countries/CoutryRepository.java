package com.dio.citiesapi.countries;

import com.dio.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoutryRepository extends JpaRepository<Country, Long> {
}
