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

    @PostMapping("/{id}")
    public String helloWorldPost(@PathVariable("id") String id, @RequestParam(value = "filter", defaultValue = "nenhum") String filter,@RequestBody User body){
        return "Hello World " + body.getName() + id + filter;
    }

    @PutMapping("/{id}")
    public String helloWorldPut(@PathVariable("id") String id){
      return "Hello World" + id;
    }
    
    @PatchMapping("{id}")
    public String helloWorldPatch(@PathVariable("id") String id){
        String s = "Hello World Patch" + id;
        return s;
    }
    
    @DeleteMapping("/{id}")
    public String helloWorldDelete(@PathVariable("id") String id){
        return "Hello World Delete" + id;
    }


}
