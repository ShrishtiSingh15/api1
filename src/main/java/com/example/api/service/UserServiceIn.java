package com.example.api.service;

import com.example.api.model.user;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

public interface UserServiceIn {
    //save operation
    user saveUser(user User);

    //read operation
    List<user> fetchUserList();

    //update operation
    user updateUser(user User, int sid);

    //delete operation
    void deleteUser(int sid);
}
