package com.krishna.project.users.controllers;


import com.krishna.project.users.model.Events;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @PostMapping("/events/create")
    public String eventCreation(Events event){

        return "Success";
    }

}
