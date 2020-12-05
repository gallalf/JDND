package com.udacity.pricing;

import com.udacity.pricing.domain.price.Price;
import com.udacity.pricing.domain.price.PriceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

/**
 * Creates a Spring Boot Application to run the Pricing Service.
 */
@SpringBootApplication
@EnableEurekaClient
public class PricingServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PricingServiceApplication.class, args);
    }

    /**
     * Initializes the prices available to the Pricing API.
     * @param repository where the price information persists.
     * @return the prices to add to the related repository
     */
    @Bean
    CommandLineRunner initDatabase(PriceRepository repository) {
        return args -> {
            repository.save(new Price("US$", new BigDecimal(50000)));
            repository.save(new Price("US$", new BigDecimal(150000)));
            repository.save(new Price("US$", new BigDecimal(20000)));
            repository.save(new Price("US$", new BigDecimal(350000)));
            repository.save(new Price("US$", new BigDecimal(120000)));
        };
    }
}
