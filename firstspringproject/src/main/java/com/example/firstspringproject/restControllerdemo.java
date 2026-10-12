package com.example.firstspringproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;


@RestController
@RequestMapping("/students")
public class restControllerdemo {
    @GetMapping ("/{id}")
    public String getuser (@PathVariable long id){
        return "user " + id;
    }

    @PostMapping 
    public String createuser(@RequestBody String user){
        return "created : " + user;
    }

    @PutMapping("/{id}")
    public String updateuser(@PathVariable long id, @RequestBody String user){
        return "updated : " + user;
    }

    @DeleteMapping("/{id}")
    public String deleteuser(@PathVariable Long id){
        return "Deleted "+ id;
    }
    
}
