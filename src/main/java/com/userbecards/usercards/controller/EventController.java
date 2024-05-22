package com.userbecards.usercards.controller;

import com.userbecards.usercards.model.Eventcards;
import com.userbecards.usercards.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eventcards")
@CrossOrigin(origins = "http://localhost:3000") // Allow requests from localhost:3000
public class EventController {

    @Autowired
    private EventService eventService;

    @PostMapping("/add")
    public String add(@RequestBody Eventcards eventcards){
        eventService.saveEventcards(eventcards);
        return "New event added successfully";
    }

    @GetMapping("/getAll")
    public List<Eventcards> getAllEventcards(){
        return eventService.getAllEventcards();
    }

    @GetMapping("/category/{category}")
    public List<Eventcards> getEventcardsByCategory(@PathVariable String category) {
        return eventService.getEventcardsByCategory(category);
    }

}
