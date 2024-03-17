package com.example.springbootcourse.repositories;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class SauceRepository {
    public String getSauce() {
        return "Соус";
    }

    @PostConstruct
    public void postConstruct() {
        log.info("Sauce repository created");
    }

    @PreDestroy
    public void preDestroy() {
        log.info("Sauce repository destroyed");
    }
}
