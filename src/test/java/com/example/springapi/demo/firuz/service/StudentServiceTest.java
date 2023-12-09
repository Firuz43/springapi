package com.example.springapi.demo.firuz.service;

import com.example.springapi.demo.firuz.entity.Student;
import com.example.springapi.demo.firuz.repository.StudentRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class StudentServiceTest {

    @Autowired
    private StudentService studentService;

    @MockBean
    private StudentRepository studentRepository;

    @BeforeEach
    void setUp() {
        Student student =
                Student.builder()
                        .firstName("Dilovar")
                        .lastName("Alimardonov")
                        .build();

        Mockito.when(studentRepository.findStudentByFirstNameIgnoreCase("Dilovar"))
                .thenReturn(student);
    }


    //Here we are creating String first name and creating Student found then calling service passing
    //our String to getStudentByName method
    @Test
    @DisplayName("Get data based on Valid Student name")
    @Disabled
    public void whenValidStudentName_thenStudentShouldFound() {
        String firstName = "Dilovar";
        Student found = studentService.getStudentByName(firstName);

        assertEquals(firstName, found.getFirstName());
    }
}