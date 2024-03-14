package com.example.springbootcourse.controllers;

import com.example.springbootcourse.dto.Dish;
import com.example.springbootcourse.dto.DishIn;
import com.example.springbootcourse.dto.MyException;
import com.example.springbootcourse.service.DishService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RestController
@RequestMapping(value = "/api/my/v1")
public class FoodController {
    DishService dishService;

    @PostMapping("/dishes/add")
    public Dish createDish(@RequestBody DishIn dishIn) {
        return dishService.createDish(dishIn);
    }

    @GetMapping("/exc")
    public String getCustomException() throws MyException {
        throw new MyException("You got a 502 error. Takie dela");
    }
}
