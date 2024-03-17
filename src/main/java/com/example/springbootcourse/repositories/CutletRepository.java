package com.example.springbootcourse.repositories;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class CutletRepository implements FoodRepository {
    @Override
    public String getFoodName() {
        return "Котлетка";
    }

    @PostConstruct
    public void postConstruct() {
        log.info("Cutlet repository created");
    }

    @PreDestroy
    public void preDestroy() {
        log.info("Cutlet repository destroyed");
    }
}
