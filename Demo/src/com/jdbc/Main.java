package com.jdbc;

import com.jdbc.dto.StudentDTO;
import com.jdbc.service.StudentService;
import com.jdbc.service.impl.StudentRepositoryImpl;
import com.jdbc.service.impl.StudentServiceImpl;

import java.util.List;

public class Main {
    private StudentService studentService;
    public static void main(String[] args) {
        Main m = new Main();
        m.run();
    }
    public void run() {
        studentService = new StudentServiceImpl(new StudentRepositoryImpl());
        List< StudentDTO> list = studentService.findAllStudents();
    }
}