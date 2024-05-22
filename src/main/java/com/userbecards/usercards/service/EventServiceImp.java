package com.userbecards.usercards.service;

import com.userbecards.usercards.model.Eventcards;
import com.userbecards.usercards.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventServiceImp implements EventService{

    @Autowired
    private EventRepository eventRepository;

    @Override
    public Eventcards saveEventcards(Eventcards eventcards) {
        return eventRepository.save(eventcards);
    }

    @Override
    public List<Eventcards> getAllEventcards() {
        return eventRepository.findAll();
    }

    @Override
    public List<Eventcards> getEventcardsByCategory(String category) {
        return eventRepository.findByEventCategory(category);
    }
}





