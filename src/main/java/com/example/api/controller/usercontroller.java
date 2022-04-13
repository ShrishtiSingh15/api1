package com.example.api.controller;

import com.example.api.exception.UserNotFoundException;
import com.example.api.model.user;
import com.example.api.repository.userrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
public class usercontroller {

    @Autowired
    userrepository userrepository;

    @GetMapping("/users")
    public List<user> getAllNotes(
//            @RequestParam Optional<Integer> page,
//            @RequestParam Optional<String> sortBy
            ){
//        return (List<user>) userrepository.findAll(
//                PageRequest.of(
//                        page.orElse(0),
//                        5,
//                        Sort.Direction.ASC, sortBy.orElse("sid")
//                )
//        );
        return  userrepository.findAll();
    }

    @PostMapping("/users")
    public user createNote(@RequestBody user User){
        return userrepository.save(User);
    }

    @GetMapping("/users/{sid}")
    public user getNoteById(@PathVariable(value = "sid") int userId) throws UserNotFoundException {
        return userrepository.findById(userId).orElseThrow(()->new UserNotFoundException(userId));
    }


    @DeleteMapping("/books/{sid}")
    public ResponseEntity<?> deleteUser(@PathVariable(value = "sid") int userId) throws UserNotFoundException {
        user User = userrepository.findById(userId).orElseThrow(() -> new UserNotFoundException(userId));
        userrepository.delete(User);
        return ResponseEntity.ok().build();
    }
}
