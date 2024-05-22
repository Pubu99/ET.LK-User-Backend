package com.userbecards.usercards.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Eventcards {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String eventName;
    private String eventDate;
    private String eventTime;
    private String eventLocation;
    private String eventDescription; // Added new field for event description
    private String ticketDetails; // Added new field for ticket details
    private String eventCategory; // Added new field for event category
    private String flyerLink; // Added new field for flyer link

    public Eventcards() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getEventTime() {
        return eventTime;
    }

    public void setEventTime(String eventTime) {
        this.eventTime = eventTime;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getTicketDetails() {
        return ticketDetails;
    }

    public void setTicketDetails(String ticketDetails) {
        this.ticketDetails = ticketDetails;
    }

    public String getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(String eventCategory) {
        this.eventCategory = eventCategory;
    }

    public String getFlyerLink() {
        return flyerLink;
    }

    public void setFlyerLink(String flyerLink) {
        this.flyerLink = flyerLink;
    }
}
