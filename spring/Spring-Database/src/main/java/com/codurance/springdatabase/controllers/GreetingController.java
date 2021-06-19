package com.codurance.springdatabase.controllers;

import com.codurance.springdatabase.entities.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greeting")
class GreetingController {
  private final Greeting greeting;

  public GreetingController(Greeting greeting) {
    this.greeting = greeting;
  }

  @GetMapping
  String getGreeting() {
    return greeting.getName();
  }

  @GetMapping("/coffee")
  String getNameAndCoffee() {
    return greeting.getCoffee();
  }
}
