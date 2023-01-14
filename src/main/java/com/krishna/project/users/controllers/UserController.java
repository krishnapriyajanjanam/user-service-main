package com.krishna.project.users.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.krishna.project.users.model.User;

@RestController
public class UserController {

    @PostMapping("/user/register")
    public String register(@RequestBody User user){


        return "Hi "+user.getName();
    }


}
