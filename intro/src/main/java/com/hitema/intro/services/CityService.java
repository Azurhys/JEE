package com.hitema.intro.services;

import com.hitema.intro.models.City;

import java.util.List;

/**
 * Interface CRUD sur les City
 */
public interface CityService {
    // C reate
    City create(City city);

    // R read
    City read(Long id);

    // U pdate
    City update(City city);

    // D elete
    boolean delete(Long id);

    List<City> readAll();
}
