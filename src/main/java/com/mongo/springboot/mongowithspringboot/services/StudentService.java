package com.mongo.springboot.mongowithspringboot.services;

import com.mongo.springboot.mongowithspringboot.models.Student;
import com.mongo.springboot.mongowithspringboot.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }


    public String insertData(Student student) {
        try {
            studentRepository.insert(student);
            return "Data inserted success";
        } catch (Exception e) {
            throw new RuntimeException("Some thing went wrong");
        }
    }

    public List<Student> getStudents() {
       return studentRepository.findAll();
    }
}
