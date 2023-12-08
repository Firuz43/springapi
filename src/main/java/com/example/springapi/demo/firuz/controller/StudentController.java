package com.example.springapi.demo.firuz.controller;

import com.example.springapi.demo.firuz.entity.Student;
import com.example.springapi.demo.firuz.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/students")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/students")
    public List<Student> fetchStudents() {
        return studentService.fetchStudents();
    }

    @GetMapping("/students/{id}")
    public Student getStudent(@PathVariable("id") Long studentId) {
        return studentService.getStudent(studentId);
    }

    @DeleteMapping("/students/{id}")
    public String deleteStudent(@PathVariable("id") Long studentId) {
        studentService.deleteStudent(studentId);
        return "Deleted successfully";
    }

    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable("id") Long studentId,
                                 @RequestBody Student student) {
        return studentService.updateStudent(studentId, student);
    }

    @GetMapping("/students/name/{name}")
    public Student getStudentByName(@PathVariable("name") String firstName) {
        return studentService.getStudentByName(firstName);
    }
}
