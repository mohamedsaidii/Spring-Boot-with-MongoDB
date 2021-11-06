package com.example.springbootwithmongodb.Service;

import com.example.springbootwithmongodb.Exception.StudentNotFoundException;
import com.example.springbootwithmongodb.Repositories.StudentRepository;
import com.example.springbootwithmongodb.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@AllArgsConstructor
@Service
public class StudentService {
    private final StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();

    }

    public String createdStudent(Student student)
    {
        Student insertedStudent =studentRepository.insert(student);
        return "Student created"+insertedStudent.getName();
    }


    public void deleteStudent(long id) {
        studentRepository.deleteById(id);
    }

    public void putStudent(long id,Student student) {
        student.setId(id);
        student.setName(student.getName());
        student.setAge(student.getAge());
        student.setGrade(student.getGrade());
        studentRepository.save(student);
    }

    public void postStudent(@RequestBody Student student) {
        student.setId(student.getId());
        student.setName(student.getName());
        student.setAge(student.getAge());
        student.setGrade(student.getGrade());
        studentRepository.save(student);
    }

    public Student getStudent(@PathVariable long id) {
        return studentRepository
                .findById(id)
                .orElseThrow(StudentNotFoundException::new);
    }


}
