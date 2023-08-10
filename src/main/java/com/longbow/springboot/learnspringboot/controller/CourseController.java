package com.longbow.springboot.learnspringboot.controller;

import com.longbow.springboot.learnspringboot.model.Course;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {


    @RequestMapping("/courses")
    public List<Course> retrieveAllCourse(){
        return Arrays.asList(
                new Course(1,"Learn AWS","in 24 hours"),
                new Course(2,"Learn DevOps","in 24 hours"),
                new Course(3,"Learn Azure","in 24 hours")
        );
    }
}
