package com.example.springapi.demo.firuz.repository;

import com.example.springapi.demo.firuz.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    public Student findStudentByFirstNameIgnoreCase(String firstName);
}
