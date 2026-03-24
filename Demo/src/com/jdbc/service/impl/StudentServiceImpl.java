package com.jdbc.service.impl;

import com.jdbc.dto.StudentDTO;
import com.jdbc.repository.StudentRepository;
import com.jdbc.service.StudentService;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository =studentRepository;
    }

    @Override
    public List<StudentDTO> findAllStudents() {
        return studentRepository.findAllStudents();
    }
}