package com.mongo.springboot.mongowithspringboot.config;

import com.github.cloudyrock.mongock.ChangeLog;
import com.github.cloudyrock.mongock.ChangeSet;
import com.mongo.springboot.mongowithspringboot.models.Student;
import com.mongo.springboot.mongowithspringboot.repositories.StudentRepository;

import java.util.ArrayList;
import java.util.List;

@ChangeLog
public class StudentSeedData {

    @ChangeSet(order = "001", id="studentData", author = "DIleep")
    public void seedData(StudentRepository studentRepository) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("1", "Dileep", "Mongo"));
        list.add(new Student("2", "Sumit", "Java"));
        studentRepository.insert(list);
    }
}
