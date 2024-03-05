package com.example.springbootcourse.config;

import com.example.springbootcourse.repositories.CutletRepositoryImpl;
import com.example.springbootcourse.repositories.FoodRepository;
import com.example.springbootcourse.repositories.PotatoRepositoryImpl;
import com.example.springbootcourse.repositories.SauceRepositoryImpl;
import com.example.springbootcourse.service.FoodService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class DiConfig {

    @Bean
    @Scope(scopeName = "Singleton")
    public FoodService createFoodService(FoodRepository potatoRepository) {
        return new FoodService(potatoRepository);
    }

    @Bean(name = "potatoRepository")
    public FoodRepository createPotatoRepository() {
        return new PotatoRepositoryImpl();
    }

    @Bean(name = "cutletRepository")
    public FoodRepository createCutletRepository() {
        return new CutletRepositoryImpl();
    }

    @Bean
    public SauceRepositoryImpl createSauceRepository() {
        return new SauceRepositoryImpl();
    }
}
