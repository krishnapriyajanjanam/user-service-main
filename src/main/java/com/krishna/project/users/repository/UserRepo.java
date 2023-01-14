package com.krishna.project.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.krishna.project.users.model.Users;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users,String> {


}
