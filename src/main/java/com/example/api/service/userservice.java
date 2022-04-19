package com.example.api.service;

import com.example.api.model.user;
import com.example.api.repository.userrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class userservice implements UserServiceIn{

    @Autowired
    userrepository userrepository;


    //save operation
    @Override
    public user saveUser(user User){
        return userrepository.save(User);
    }

    //read operation
    @Override
    public List<user> fetchUserList(){
        return (List<user>)userrepository.findAll();
    }

    //update operation
    public user updateUser(user User, int sid)
    {
        user u = userrepository.findById(sid).get();

        if(Objects.nonNull(User.getSname()) && !"".equalsIgnoreCase(User.getSname())){
            u.setSname(User.getSname());
        }
        if (Objects.nonNull(User.getLocation())&& !"".equalsIgnoreCase(User.getLocation())){
            u.setLocation(User.getLocation());
        }
        return userrepository.save(u);
    }

    //delete operation
    @Override
    public void deleteUser(int sid)
    {
        userrepository.deleteById(sid);
    }

}
