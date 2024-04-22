/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.studentmarks.service;

import com.example.studentmarks.data.Student;
import com.example.studentmarks.data.StudentRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author fradd
 */
@Service
public class StudentService {
    
    @Autowired
    private StudentRepository studentRepository;
    
    public List<Student> getAllStudent(){
        List<Student> students = studentRepository.findAll();
        return students;
    }
    
    public Student insertStudent(Student student){
        return studentRepository.save(student);
    }
    
    public List<String> getStudentsWith50Marks() {
    List<Student> students = studentRepository.findAll();
    List<String> studentNames = new ArrayList<>();
    for (Student student : students) {
        if (student.getMarks() > 50) {
            studentNames.add(student.getName());
        }
    }
    return studentNames;
}
}
