package ru.services.countryservice.repository;

import ru.services.countryservice.model.Country;

public interface CountryRepository {
    Country findCountryByCode(String code);
}