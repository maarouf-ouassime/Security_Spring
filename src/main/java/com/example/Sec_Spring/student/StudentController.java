package com.example.Sec_Spring.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController @RequestMapping("api/v1/students")
public class StudentController {
    private final List<Student> students = Arrays.asList(
            new Student(1,"Maarouf Ouassime"),
            new Student(2,"Ali Mehaouchi"),
            new Student(3,"Khadija ELmoumni")
    );
    @GetMapping(path = "{studentId}")
    public Student getStudent(@PathVariable("studentId") Integer studentId) {
        return students.stream()
                .filter(student -> studentId.equals(student.getStudentId()))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException(
                        "Student " + studentId + " does not exists"
                ));
    }
}

