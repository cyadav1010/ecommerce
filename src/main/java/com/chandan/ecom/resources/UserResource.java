package com.chandan.ecom.resources;

import com.chandan.ecom.entity.User;
import com.chandan.ecom.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserResource {

    @Autowired
    private UserService userService;

    @PostMapping
   public List<User> createUser(@RequestBody User user){
        System.out.println("user = " + user);
        userService.createUser(user);
        return userService.getUsersDetails();
   }

   @GetMapping
   public List<User> getAllUsers(){
        return userService.getUsersDetails();
   }

}
