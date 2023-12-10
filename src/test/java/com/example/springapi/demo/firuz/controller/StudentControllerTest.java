package com.example.springapi.demo.firuz.controller;

import com.example.springapi.demo.firuz.entity.Student;
import com.example.springapi.demo.firuz.service.StudentService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

@WebMvcTest(StudentController.class)
class StudentControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private StudentService studentService;

    private Student student;

    @BeforeEach
    void setUp() {
        student = Student.builder()
                .firstName("Dilovar")
                .lastName("Alimardonov")
                .id(1L)
                .build();
    }

    @Test
    void saveStudent() {
        Student intputStudent = Student.builder()
                .firstName("Dilovar")
                .lastName("Alimardonov")
                .build();

        Mockito.when(studentService.saveStudent(intputStudent))
                .thenReturn(student);
    }

    @Test
    void getStudent() {
    }
}