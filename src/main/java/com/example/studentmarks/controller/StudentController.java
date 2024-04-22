/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.studentmarks.controller;

import com.example.studentmarks.data.Student;
import com.example.studentmarks.service.StudentService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author fradd
 */
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    
    @GetMapping(path = "/students")
    public List<Student> getAllStudent(){
        return studentService.getAllStudent();
    }
    @PostMapping(path = "/students")
    public Student insertStudent(@RequestBody Student student){
        return studentService.insertStudent(student);
    }
    
    @GetMapping(path = "/studentmarks")
    public List<String> getStudentsWith50Marks(){
        return studentService.getStudentsWith50Marks();
    }
}
