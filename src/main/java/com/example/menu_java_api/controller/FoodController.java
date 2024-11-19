package com.example.menu_java_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.menu_java_api.food.Food;

@RestController
@RequestMapping("food")

public class FoodController {

    @GetMapping
    public void getAll(){

        Food food;
    }

}
