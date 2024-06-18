package com.lnt.spring_boot_db_demo.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.lnt.spring_boot_db_demo.entities.Course;
import com.lnt.spring_boot_db_demo.repos.CourseRepository;

import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class CourseController {
    @Autowired
    CourseRepository courseRepository;

    @PostMapping("/courses")
    public void addCourse(@RequestBody Course course){
        courseRepository.save(course);
    }

    @GetMapping("/courses")
    public List<Course> fetchAllCourses() {
        return courseRepository.findAll();
    }
    
    
}
