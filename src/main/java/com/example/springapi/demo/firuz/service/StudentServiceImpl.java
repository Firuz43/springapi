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

    //Saving student to database
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    //Fetching list of students from database
    @Override
    public List<Student> fetchStudents() {
        return studentRepository.findAll();
    }

    //Fetching student by id
    @Override
    public Student getStudent(Long studentId) {
        return studentRepository.findById(studentId).get();
    }


    //Deleting student from database
    @Override
    public void deleteStudent(Long studentId) {
        studentRepository.deleteById(studentId);
    }


    //Update student to database
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
