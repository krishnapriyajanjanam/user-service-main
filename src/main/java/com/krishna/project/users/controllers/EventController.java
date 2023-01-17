package com.krishna.project.users.controllers;


import com.krishna.project.users.model.Events;
import com.krishna.project.users.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

    @Autowired
    EventService eventService;
    @PostMapping("/events/create")
    public String eventCreation(@RequestBody Events event){

        String output = eventService.createEvent(event);

        return output;
    }

}
