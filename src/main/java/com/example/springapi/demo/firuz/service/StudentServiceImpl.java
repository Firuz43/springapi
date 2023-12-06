package com.example.springapi.demo.firuz.service;

import com.example.springapi.demo.firuz.entity.Student;
import com.example.springapi.demo.firuz.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
