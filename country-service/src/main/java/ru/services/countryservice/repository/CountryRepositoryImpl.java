package ru.services.countryservice.repository;


import org.springframework.stereotype.Repository;
import ru.services.countryservice.model.Country;

import java.util.HashMap;
import java.util.Map;

@Repository
public class CountryRepositoryImpl implements CountryRepository {

    @Override
    public Country findCountryByCode(String code) {
        return getCountriesBase().get(code);
    }

    private Map<String, Country> getCountriesBase() {
        Map<String, Country> countries = new HashMap<>();
        countries.put("1", new Country("1", "Russia"));
        countries.put("2", new Country("2", "Belarus"));
        countries.put("3", new Country("3", "China"));
        return countries;
    }
}