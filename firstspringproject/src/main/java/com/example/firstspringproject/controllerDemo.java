package com.example.firstspringproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class controllerDemo {
    @Autowired 
    helloworld hw;

    @GetMapping
    public String getHelloWorld(){
        return hw.display();
    }

    @GetMapping ("/{id}") 
    public String getHelloWorldwitid(@PathVariable int id){
        return "hello "+id;
    }
}
