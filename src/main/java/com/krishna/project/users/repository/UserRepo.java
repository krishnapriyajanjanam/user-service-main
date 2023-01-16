package com.krishna.project.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.krishna.project.users.model.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users,String> {

    @Query(value="Select * from Users where email = ?1",nativeQuery=true)
    public Users usersData(String email);


}
