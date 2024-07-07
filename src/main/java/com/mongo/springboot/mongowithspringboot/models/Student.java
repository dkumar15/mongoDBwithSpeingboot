package com.mongo.springboot.mongowithspringboot.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("students")
@Data
public class Student {
    @Id
    private String id;
    private String name;
    private String course;

    public Student() {
    }

    public Student(String id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }
}
