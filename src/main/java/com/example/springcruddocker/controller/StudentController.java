package com.example.springcruddocker.controller;

import com.example.springcruddocker.entity.Student;
import com.example.springcruddocker.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/findAll")
    public List<Student> findAllStudent(){
        return  studentRepository.findAll();   }
    @PostMapping("/add")
    public Student createStudent(@RequestBody Student student){
    return studentRepository.save(student);
    }
}
