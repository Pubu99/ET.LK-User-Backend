package com.userbecards.usercards.service;

import com.userbecards.usercards.model.Eventcards;

import java.util.List;

public interface EventService {

    public Eventcards saveEventcards(Eventcards eventcards);

    public List<Eventcards> getAllEventcards();

    public List<Eventcards> getEventcardsByCategory(String category);
}
