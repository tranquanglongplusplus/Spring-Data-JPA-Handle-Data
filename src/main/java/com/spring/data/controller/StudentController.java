package com.spring.data.controller;

import com.spring.data.response.StudentResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Value("${app.name}")
    private String name;

    @Value("${app.name2: default name}")
    private String name2;

    @GetMapping("/student_1")
    public String getStudent1 (){
        return name;
    }

    @GetMapping("/student_2")
    public String getStudent2 (){
        return name2;
    }

    @GetMapping("/response")
    public StudentResponse getResponse(){
        StudentResponse str = new StudentResponse((long)1, "john", "smith");
        return str;
    }

}