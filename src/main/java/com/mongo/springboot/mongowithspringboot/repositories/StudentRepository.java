package com.mongo.springboot.mongowithspringboot.repositories;

import com.mongo.springboot.mongowithspringboot.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, String> {
}
