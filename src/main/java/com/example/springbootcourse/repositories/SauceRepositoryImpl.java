package com.example.springbootcourse.repositories;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class SauceRepositoryImpl {
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
