package com.hitema.intro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hitema.intro.models.City;

public interface CityRepository extends JpaRepository<City, Long> {
}