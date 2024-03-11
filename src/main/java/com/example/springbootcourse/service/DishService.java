package com.example.springbootcourse.service;

import com.example.springbootcourse.dto.AdditionalInfo;
import com.example.springbootcourse.dto.Dish;
import com.example.springbootcourse.dto.DishIn;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class DishService {
    private final ArrayList<Dish> dishes = new ArrayList<>();

    public Dish createDish(DishIn dishIn) {
        var id = dishes.size();
        var dish = new Dish(
                dishIn.price(),
                new AdditionalInfo(
                        id,
                        dishIn.info().date()
                )
        );
        dishes.add(dish);
        return dish;
    }
}
