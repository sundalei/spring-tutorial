package com.demo.learning.courses.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.learning.courses.bean.Course;

@RestController
public class CourseController {
    
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return Arrays.asList(new Course(1, "Learn Microservices", "in28minutes"),
        		new Course(2, "Learn Full Stack with Angular and React", "in28minutes"));
    }
    
    @GetMapping("/courses/1")
    public Course getCourseDetails() {
    	return new Course(1, "Learn Microservices", "in28minutes");
    }
}
