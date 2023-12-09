package com.example.springapi.demo.firuz.repository;

import com.example.springapi.demo.firuz.entity.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private TestEntityManager testEntityManager;

    @BeforeEach
    void setUp() {
        Student student =
                Student.builder()
                        .firstName("Dilovar")
                        .lastName("Alimardonov")
                        .build();

        testEntityManager.persist(student);
    }

    @Test
    public void whenFindById_thenReturnStudent() {
        Student student = studentRepository.findById(1L).get();

        assertEquals(student.getFirstName(), "Dilovar");
    }
}