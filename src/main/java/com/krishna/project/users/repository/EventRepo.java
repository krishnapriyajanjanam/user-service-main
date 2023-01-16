package com.krishna.project.users.repository;

import com.krishna.project.users.model.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepo extends JpaRepository<Events,Integer> {

}
