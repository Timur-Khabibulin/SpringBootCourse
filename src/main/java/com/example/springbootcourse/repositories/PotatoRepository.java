package com.example.springbootcourse.repositories;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Component
@Log4j2
public class PotatoRepository implements FoodRepository {
    @Override
    public String getFoodName() {
        return "Пюрешка";
    }

    @PostConstruct
    public void postConstruct() {
        log.info("Potato repository created");
    }

    @PreDestroy
    public void preDestroy() {
        log.info("Potato repository destroyed");
    }
}
