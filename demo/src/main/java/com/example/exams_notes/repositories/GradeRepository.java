package com.example.exams_notes.repositories;

import com.example.exams_notes.entities.Grade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GradeRepository extends JpaRepository<Grade, Long> {
}
