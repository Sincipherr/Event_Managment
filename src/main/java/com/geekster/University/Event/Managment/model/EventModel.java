package com.geekster.University.Event.Managment.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
@Entity
public class EventModel {
    @Id
    private Integer eventId;
    @Column(unique = true)
    private String eventName;
    private  String locationOfEvent;
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
}
