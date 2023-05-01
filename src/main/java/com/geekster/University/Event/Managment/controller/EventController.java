package com.geekster.University.Event.Managment.controller;

import com.geekster.University.Event.Managment.model.EventModel;
import com.geekster.University.Event.Managment.service.EventService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@RestController
public class EventController {
    //add event , update event , delete event , get all event by date
    @Autowired
    EventService es;
    @GetMapping(value = "/event/{date}")
    public List<EventModel> eventbydate(@PathVariable LocalDate date){
        return es.eventbydate(date);
    }
    @PostMapping(value = "/addevent")
    public String addevent(@RequestBody List<EventModel> event){
        return es.addevent(event);
    }
    @PutMapping(value = "/updateevent/{location}/{id}")
    public void updatebyid(@PathVariable String location,@PathVariable Integer id){
        es.updatebyid(location,id);
    }
    @DeleteMapping(value = "/deletebyid/{id}")
    public void deleteevent(@PathVariable Integer id){
        es.deleteevent(id);
    }
}
