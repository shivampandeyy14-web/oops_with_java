package com.example.firstspringproject.controller;


import org.springframework.web.bind.annotation.*;
import java.util.*;
import com.kiet.student

public class studentcontroller {
    List<student> users = new ArrayList<>();

    @PostMapping 
    public String adduser(@RequestBody student u){
        users.add(u);
        return "Added " + u.getName();
    }

    @GetMapping 
    public List<student> getAllusers(){
        return users;
    }

    @GetMapping
    public student getuser(@PathVariable Long id){
        for(student u: users){
            if(u.getid().equals(id)){
                return u;
            }
        }
    }
}
