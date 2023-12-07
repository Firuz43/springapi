package com.example.springapi.demo.firuz.service;

import com.example.springapi.demo.firuz.entity.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);

    public List<Student> fetchStudents();

    public Student getStudent(Long studentId);

    public void deleteStudent(Long studentId);

    public Student updateStudent(Long studentId, Student student);
}
