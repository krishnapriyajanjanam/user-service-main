package com.krishna.project.users.service;

import com.krishna.project.users.model.Users;

public interface UserService {

    public String register(Users user);

    public Users fetchUser(String email);
}


