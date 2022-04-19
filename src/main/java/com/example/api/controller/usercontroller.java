package com.example.api.controller;

import com.example.api.model.user;
import com.example.api.service.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class usercontroller {
    @Autowired
    private userservice userservice;

    @PostMapping("/users")
    public user saveUser(@Validated @RequestBody user User)
    {
        return userservice.saveUser(User);
    }

    @GetMapping("/users/{pageNo}/{pageSize}")
    public List<user> fetchUserList(@PathVariable int pageNo, @PathVariable int pageSize)
    {
        return userservice.fetchUserList(pageNo, pageSize);
    }

    @PutMapping("/users/{id}")
    public user updateUser(@RequestBody user User, @PathVariable("id") int sid)
    {
        return userservice.updateUser(User,sid);
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable("id") int sid)
    {
        userservice.deleteUser(sid);
        return "Deleted Successfully";
    }

}
