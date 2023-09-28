package com.university.eventmanagement.model;

import jakarta.persistence.*;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

// Student.java
@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    @NotBlank
    @Size(min = 1, max = 25)
    private String firstName;

    @NotBlank
    @Size(min = 1, max = 25)
    private String lastName;

    @Min(18)
    @Max(25)
    private int age;

    @Enumerated(EnumType.STRING)
    private Department department;

    // Constructors, getters, setters, and other methods
}
