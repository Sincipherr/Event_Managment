package com.geekster.University.Event.Managment.Repository;

import com.geekster.University.Event.Managment.model.EventModel;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Repository
public interface IEventRepo extends CrudRepository<EventModel,Integer> {
    public List<EventModel> findEventModelByDate(LocalDate date);

    @Modifying
    @Query(value = "update event_model set location_of_event= :location where event_id= :id",nativeQuery = true)
    public void updateeventbyid(String  location,Integer id);
}
