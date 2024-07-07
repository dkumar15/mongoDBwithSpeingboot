package com.mongo.springboot.mongowithspringboot.controllers;

import com.mongo.springboot.mongowithspringboot.models.Student;
import com.mongo.springboot.mongowithspringboot.services.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/student")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<String> addStudent(@RequestBody Student student)  {
        return  ResponseEntity.status(HttpStatus.CREATED).body(studentService.insertData(student));
    }

    @GetMapping
    public ResponseEntity<List<Student>> getStudents() {
        return ResponseEntity.ok(studentService.getStudents());
    }

}
