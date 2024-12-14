package com.example.exams_notes.services;


import com.example.exams_notes.entities.Grade;
import com.example.exams_notes.entities.Student;
import com.example.exams_notes.repositories.GradeRepository;
import com.example.exams_notes.repositories.StudentRepository;
import org.springframework.stereotype.Service;

@Service
public class GradeService {
    private final GradeRepository gradeRepository;
    private final StudentRepository studentRepository;

    public GradeService(GradeRepository gradeRepository, StudentRepository studentRepository) {
        this.gradeRepository = gradeRepository;
        this.studentRepository = studentRepository;
    }
    public Grade addGrade(Long studentId, Grade grade) {
        Student student = studentRepository.findById(studentId)
                .orElseThrow(() -> new IllegalArgumentException("Student not found"));
        grade.setStudent(student);
        return gradeRepository.save(grade);
    }
}
