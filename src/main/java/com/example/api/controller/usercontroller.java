package com.example.api.controller;

//import com.example.api.exception.UserNotFoundException;
//import com.example.api.model.user;
//import com.example.api.repository.userrepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.domain.PageRequest;
//import org.springframework.data.domain.Sort;
//import org.springframework.http.ResponseEntity;
import com.example.api.exception.UserNotFoundException;
import com.example.api.model.user;
import com.example.api.repository.userrepository;
import com.example.api.service.userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


//import java.util.List;
//import java.util.Optional;

@RestController
public class usercontroller {
    @Autowired
    private userservice userservice;

    @GetMapping("/users")
    public List<user> getUser(){
    return userservice.getAllNotes();
    }
}