package com.example.springapi.demo.firuz.service;

import com.example.springapi.demo.firuz.entity.Student;
import com.example.springapi.demo.firuz.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> fetchStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudent(Long studentId) {
        return studentRepository.findById(studentId).get();
    }

    @Override
    public void deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
    }

    @Override
    public Student updateStudent(Long studentId, Student student) {
        Student studentDb = studentRepository.findById(studentId).get();

        if(Objects.nonNull(student.getFirstName()) &&
                !"".equalsIgnoreCase(student.getFirstName())) {
            studentDb.setFirstName(student.getFirstName());
        }

        if(Objects.nonNull(student.getLastName()) &&
        !"".equalsIgnoreCase(student.getLastName())) {
            studentDb.setLastName(student.getLastName());
        }

        return studentRepository.save(studentDb);
    }

    @Override
    public Student getStudentByName(String firstName) {
        return studentRepository.findStudentByFirstNameIgnoreCase(firstName);
    }


}
