package com.sumit.playjava.controller;

import com.sumit.playjava.entity.User;
import com.sumit.playjava.respository.Reposiroty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class LoginController {
    @Autowired
    Reposiroty reposiroty;

    @PostMapping("/register")
    public User Register(@RequestBody User user){
        reposiroty.save(user);
        return user;
    }

    @PostMapping("/login")
    public String Login(@RequestBody User user){
        User user1 = reposiroty.findByUsername(user.getUsername());
        if(user1!=null && user1.getPassword().equals(user.getPassword()))
        {
            return "thanh cong";
        }
        else {
            return "that bai";
        }
    }
    @GetMapping("/getUser")
    public List<User> getUser()
    {
        return  reposiroty.findAll();
    }

}
