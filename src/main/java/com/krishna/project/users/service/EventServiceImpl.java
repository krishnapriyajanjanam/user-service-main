package com.krishna.project.users.service;

import com.krishna.project.users.model.Events;
import com.krishna.project.users.repository.EventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EventServiceImpl implements EventService{

    @Autowired
    EventRepo eventRepo;

    @Override
    public String createEvent(Events event) {

        if(event.getEventId()==0){

            return "EventId can't be empty";

        }

        if(event.getEventName() == null){

            return "Event Name can't be empty";
        }

        eventRepo.saveAndFlush(event);
        return event.getEventName()+" is successfully created";

    }
}
