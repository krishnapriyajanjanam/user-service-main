package com.krishna.project.users.controllers;

import com.krishna.project.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.krishna.project.users.model.Users;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/user/register")
    public String signUp(@RequestBody Users user){

        String output = userService.register(user);

        return output;
    }

    @GetMapping("/user/fetch/{email}")
    public Users fetchUser(@PathVariable("email") String mailId){

        Users output = userService.fetchUser(mailId);

        return output;

    }

}
