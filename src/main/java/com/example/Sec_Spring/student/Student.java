package com.example.Sec_Spring.student;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data  @AllArgsConstructor  @NoArgsConstructor
public class Student {
    private  int studentId;
    private  String studentName;

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
