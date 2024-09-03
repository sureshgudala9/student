package com.test.student.controller;

import com.test.student.dto.StudentDto;
import com.test.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController

public class        StudentController {
    @Autowired
    private StudentService studentService;

    @CrossOrigin("http://localhost:55483")
    @GetMapping("/students")
    public ResponseEntity<List<StudentDto>> getStudents()
    {

        List<StudentDto> students= studentService.getStudents();
       return  ResponseEntity.ok(students);


    }


    @GetMapping
    public ResponseEntity<List<StudentDto>> getStudentsBycity(@RequestParam (value="city")String city)
    {

        List<StudentDto> students= studentService.getStudents(city);
        return  ResponseEntity.ok(students);


    }


}
