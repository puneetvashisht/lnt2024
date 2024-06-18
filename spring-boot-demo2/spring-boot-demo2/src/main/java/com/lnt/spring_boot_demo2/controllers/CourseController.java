package com.lnt.spring_boot_demo2.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import com.lnt.spring_boot_demo2.entities.Course;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
public class CourseController {

    List<Course> courses = new ArrayList<>();
    {
        courses.add(new Course(12, "ReactJS", 34343.34));
        courses.add(new Course(2, "VueJS", 44343.34));
    }

    @GetMapping("/courses")
    public List<Course> fetchCourses(){
        return courses;
    }

    @GetMapping("/courses/{id}")
    public Course fetchCourse(@PathVariable("id") int id){
        Course toBeReturned = null;
        for(Course c : courses){
            if(c.id == id){
                toBeReturned = c;
                break;
            }
        }
        if(toBeReturned == null){
            throw new CourseNotFoundException("Course not found with id: "+ id);
        }
        return toBeReturned;
    }

    @PostMapping("/courses")
    @ResponseStatus(HttpStatus.CREATED)
    public void addCourse(@RequestBody Course course){
        courses.add(course);
    }
    
}
