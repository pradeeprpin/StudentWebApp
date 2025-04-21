
package com.example.studentwebapp.service;

import com.example.studentwebapp.model.Student;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private final List<Student> studentList = new ArrayList<>();

    public void addStudent(Student s) {
        studentList.add(s);
    }

    public List<Student> getAllStudents() {
        return studentList;
    }
}
