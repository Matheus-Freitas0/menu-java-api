package com.example.menu_java_api.controller;

import com.example.menu_java_api.food.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.menu_java_api.food.Food;
import java.util.List;

@RestController
@RequestMapping("food")

public class FoodController {

    @Autowired
    private FoodRepository repository;

    @GetMapping
    public List<Food> getAll(){

        List<Food> foodList;
        foodList = repository.findAll();
        return foodList;
    }

}
