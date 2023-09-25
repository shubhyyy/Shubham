package com.example.usermanagement.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @NotBlank(message = "Username is required")
    private String username;

    @Pattern(regexp = "\\d{4}-\\d{2}-\\d{2}", message = "Date of Birth must be in the format YYYY-MM-DD")
    private String dateOfBirth;

    @Email(message = "Invalid email format")
    private String email;

    @Pattern(regexp = "\\d{12}", message = "Phone Number must be 12 digits")
    private String phoneNumber;

    // Getters and setters
}
