package com.example.springapi.demo.firuz.service;

import com.example.springapi.demo.firuz.entity.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);

    public List<Student> fetchStudents();
}
