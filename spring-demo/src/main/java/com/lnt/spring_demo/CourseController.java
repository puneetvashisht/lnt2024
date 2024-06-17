package com.lnt.spring_demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/v1")
public class CourseController {

    List<Course> courses = new ArrayList<>();
    {
        courses.add(new Course(1, "Angular", 34343.34));
    }

    @RequestMapping(path="/courses", method = RequestMethod.GET)
    public List<Course> fetchCourses(){
        return courses;
    }
    
}
