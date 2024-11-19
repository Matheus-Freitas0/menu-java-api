package com.example.menu_java_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("food")

public class FoodController {

    @GetMapping
    public void getAll(){

    }

}
