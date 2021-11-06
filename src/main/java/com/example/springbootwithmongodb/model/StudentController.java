package com.example.springbootwithmongodb.model;

import com.example.springbootwithmongodb.Service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/students")
public class StudentController {

/*    // @Autowired Autowired permet d’activer l’injection automatique de dépendance
    //use my repository in my controller class */

    private  final StudentService studentService;

    @GetMapping(value = "all")
    public List<Student> fetchAllStudents()
    {
        return studentService.getAllStudents();
    }


    @PostMapping("/create")
    public void postStudent(@RequestBody Student student) {
        studentService.postStudent(student);
    }




    @DeleteMapping("Delete/{id}")
    public void deleteStudent(@PathVariable long id) {
        studentService.deleteStudent(id);

    }



    @PutMapping("/Update/{id}")
    public void putStudent(@PathVariable long id, @RequestBody Student student) {
        studentService.putStudent(id,student);

    }


    @GetMapping("/{id}")
    public Student getStudent(@PathVariable long id) {
    return  studentService.getStudent(id);
    }
}
