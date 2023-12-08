package com.example.springapi.demo.firuz.service;

import com.example.springapi.demo.firuz.entity.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentServiceTest {

    @Autowired
    private StudentService studentService;

    @BeforeEach
    void setUp() {
    }

//    @Test
//    public void whenValidStudentName_thenStudentShouldFound() {
//        String firstName = "Firuz";
//        Student found = studentService.
//    }
}