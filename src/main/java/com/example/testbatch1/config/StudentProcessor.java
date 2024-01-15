package com.example.testbatch1.config;

import com.example.testbatch1.student.Student;
import org.springframework.batch.item.ItemProcessor;

public class StudentProcessor implements ItemProcessor<Student, Student> {
    @Override
    public Student process(Student student) throws Exception {
        return student;
    }
}
