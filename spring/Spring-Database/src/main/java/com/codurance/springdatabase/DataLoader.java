package com.codurance.springdatabase;

import com.codurance.springdatabase.entities.Coffee;
import com.codurance.springdatabase.repositories.CoffeeRepository;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.List;

@Component
class DataLoader {
  private final CoffeeRepository coffeeRepository;

  public DataLoader(CoffeeRepository coffeeRepository) {
    this.coffeeRepository = coffeeRepository;
  }

  @PostConstruct
  private void loadData() {
    coffeeRepository.saveAll(List.of(
        new Coffee("Café Cereza"),
        new Coffee("Café Ganador"),
        new Coffee("Café Lareño"),
        new Coffee("Café Três Pontas")
    ));
  }
}
