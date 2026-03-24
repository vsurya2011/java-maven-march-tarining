package com.jdbc.repository.impl;

import com.jdbc.dto.StudentDTO;
import com.jdbc.repository.StudentRepository;

import java.util.List;

public class StudentRepositoryImpl implements StudentRepository {
    @Override
    public List<StudentDTO> findAllStudents() {
      String sql="select * from new_table";
    }
}
