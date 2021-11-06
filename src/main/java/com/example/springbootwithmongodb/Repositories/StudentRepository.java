package com.example.springbootwithmongodb.Repositories;


import com.example.springbootwithmongodb.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StudentRepository  extends
                                            MongoRepository<Student,Long> {
    Optional<Student> findStudentByName(String name);








}
