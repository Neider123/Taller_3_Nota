package com.api.demo.repository;

import org.springframework.stereotype.Repository;

import com.api.demo.entities.User;

@Repository
public class UserRepository {
	
    public User findUserByEmail(String email){
        User user = new User(email,"123456");
        return user;
    }


}
