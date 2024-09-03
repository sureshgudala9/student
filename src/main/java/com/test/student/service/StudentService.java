package com.test.student.service;

import com.test.student.dto.StudentDto;

import java.util.List;
import java.util.Optional;

public interface StudentService {

    public List<StudentDto> getStudents();

            public List<StudentDto> getStudents(String city);
}
