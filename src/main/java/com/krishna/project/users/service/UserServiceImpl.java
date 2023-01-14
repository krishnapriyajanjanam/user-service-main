package com.krishna.project.users.service;


import com.krishna.project.users.model.Users;
import com.krishna.project.users.model.Users;
import com.krishna.project.users.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Override
    public String register(Users user) {

        if(user.getName()==null || user.getName().equals("")) {
            return "User name can't be null";
        }
        if(user.getAge() == 0){
            return "Age can't be zero";
        }
        if(user.getEmail()==null || user.getEmail().equals("")){
            return "Email can't be empty";
        }

        userRepo.saveAndFlush(user);
        return user.getName()+" your successfully registered";
    }


}
