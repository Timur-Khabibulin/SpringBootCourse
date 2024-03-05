package com.example.springbootcourse.service;

import com.example.springbootcourse.repositories.FoodRepository;
import com.example.springbootcourse.repositories.SauceRepositoryImpl;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class FoodService {
    @Autowired
    private FoodRepository cutletRepository;
    private final FoodRepository potatoRepository;
    private SauceRepositoryImpl sauceRepository;

    public FoodService(FoodRepository potatoRepository) {
        this.potatoRepository = potatoRepository;
    }

    public String getFood() {
        return potatoRepository.getFoodName() + " и " + cutletRepository.getFoodName() + " и " + sauceRepository.getSauce();
    }

    @Autowired
    public void setSauceRepository(SauceRepositoryImpl sauceRepository) {
        this.sauceRepository = sauceRepository;
    }
    @PostConstruct
    public void postConstruct() {
        log.info("Food service created");
    }

    @PreDestroy
    public void preDestroy() {
        log.info("Food service destroyed");
    }
}
