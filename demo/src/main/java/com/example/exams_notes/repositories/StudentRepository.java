package com.example.exams_notes.repositories;

import com.example.exams_notes.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
