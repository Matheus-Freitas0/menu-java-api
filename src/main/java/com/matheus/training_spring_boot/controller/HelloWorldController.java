package com.matheus.training_spring_boot.controller;

import com.matheus.training_spring_boot.domain.User;
import com.matheus.training_spring_boot.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hello-world")
public class HelloWorldController {

    @Autowired
    private final HelloWorldService helloWorldService;

    public HelloWorldController(HelloWorldService helloWorldService){
        this.helloWorldService = helloWorldService;
    }

    @GetMapping
    public String helloWorld(){
        return helloWorldService.helloWorld("Matheus");
    }

    @PostMapping("")
    public String helloWorldPost(@RequestBody User body){
        return "Hello World" + body.getName();
    }


}
