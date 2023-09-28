package com.university.eventmanagement.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.LocalDate;
import java.time.LocalTime;

// Event.java
@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eventId;

    @NotBlank
    private String eventName;

    @NotBlank
    private String locationOfEvent;

    @NotNull
    @FutureOrPresent
    private LocalDate date;

    @NotNull
    @FutureOrPresent
    private LocalTime startTime;

    @NotNull
    @FutureOrPresent
    private LocalTime endTime;
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    // Constructors, getters, setters, and other methods
}
