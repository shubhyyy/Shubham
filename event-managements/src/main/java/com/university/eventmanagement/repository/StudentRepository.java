package com.university.eventmanagement.repository;

import com.university.eventmanagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// StudentRepository.java
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
