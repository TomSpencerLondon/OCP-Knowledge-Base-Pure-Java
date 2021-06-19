package com.codurance.springdatabase.repositories;

import com.codurance.springdatabase.entities.Coffee;
import org.springframework.data.repository.CrudRepository;

public interface CoffeeRepository extends CrudRepository<Coffee, String> {
}
