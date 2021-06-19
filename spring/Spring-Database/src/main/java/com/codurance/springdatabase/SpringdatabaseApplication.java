package com.codurance.springdatabase;

import com.codurance.springdatabase.entities.Droid;
import com.codurance.springdatabase.entities.Greeting;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringdatabaseApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringdatabaseApplication.class, args);
  }

  @Bean
  @ConfigurationProperties(prefix = "droid")
  Droid createDroid(){
    return new Droid();
  }

  @Bean
  @ConfigurationProperties(prefix = "greeting")
  Greeting createGreeting(){
    return new Greeting();
  }
}

