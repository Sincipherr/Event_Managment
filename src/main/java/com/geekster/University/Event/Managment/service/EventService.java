package com.geekster.University.Event.Managment.service;

import com.geekster.University.Event.Managment.Repository.IEventRepo;
import com.geekster.University.Event.Managment.model.EventModel;
import com.sun.jdi.event.StepEvent;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Service
public class EventService {
    @Autowired
    IEventRepo er;
    public String addevent(List<EventModel> event) {
        Iterable<EventModel> list=er.saveAll(event);
        if(list!=null){
            return "Event added successfully";
        }
        return "Failed to add event...!";
    }

    public List<EventModel> eventbydate(LocalDate date) {
        return er.findEventModelByDate(date);
    }

    @Transactional
    public void updatebyid(String location, Integer id) {
        er.updateeventbyid(location,id);
    }

    public void deleteevent(Integer id) {
        er.deleteById(id);
    }
}
