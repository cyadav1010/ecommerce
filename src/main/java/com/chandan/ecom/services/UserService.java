package com.chandan.ecom.services;

import com.chandan.ecom.dao.UserDao;
import com.chandan.ecom.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {
    @Autowired
    private UserDao userDao;

    public void createUser(User user){
        userDao.save(user);
    }

    public List<User> getUsersDetails() {
        return  userDao.findAll();
    }
}
