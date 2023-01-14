package com.krishna.project.users.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Events {

    private String eventName;
    @Id
    private int eventId;
    private String venue;
    private String description;
    private String startTime;
    private String endTime;
    private String eventManager;

    public Events(String eventName, int eventId, String venue, String description, String startTime, String endTime, String eventManager) {
        this.eventName = eventName;
        this.eventId = eventId;
        this.venue = venue;
        this.description = description;
        this.startTime = startTime;
        this.endTime = endTime;
        this.eventManager = eventManager;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getEventManager() {
        return eventManager;
    }

    public void setEventManager(String eventManager) {
        this.eventManager = eventManager;
    }
}
