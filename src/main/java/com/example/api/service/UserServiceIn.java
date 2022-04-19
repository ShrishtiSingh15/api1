package com.example.api.service;

import com.example.api.model.user;
import java.util.List;

public interface UserServiceIn {
    //save operation
    user saveUser(user User);

    //read operation
    List<user> fetchUserList(int pageNo, int pageSize);

    //update operation
    user updateUser(user User, int sid);

    //delete operation
    void deleteUser(int sid);
}
