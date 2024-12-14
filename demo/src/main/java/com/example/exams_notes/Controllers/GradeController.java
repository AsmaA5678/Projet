package com.example.exams_notes.Controllers;


import com.example.exams_notes.entities.Grade;
import com.example.exams_notes.services.GradeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/grades")
public class GradeController {
    private final GradeService gradeService;

    public GradeController(GradeService gradeService) {
        this.gradeService = gradeService;
    }

    @PostMapping("/{studentId}")
    public Grade addGrade(@PathVariable Long studentId, @RequestBody Grade grade) {
        return gradeService.addGrade(studentId, grade);
    }}
