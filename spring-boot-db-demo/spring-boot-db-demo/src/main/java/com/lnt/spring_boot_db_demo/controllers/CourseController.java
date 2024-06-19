package com.lnt.spring_boot_db_demo.controllers;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.lnt.spring_boot_db_demo.entities.Course;
import com.lnt.spring_boot_db_demo.repos.CourseRepository;

import org.springframework.web.bind.annotation.PostMapping;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class CourseController {
    @Autowired
    CourseRepository courseRepository;

    @PostMapping("/courses")
    @ResponseStatus(HttpStatus.CREATED)
    public void addCourse(@RequestBody Course course){
        courseRepository.save(course);
    }

    @GetMapping("/courses/by")
    public Course fetchCourseByName(@RequestParam("title") String title){
        Course course = courseRepository.findByTitle(title);
        return course;
    }

    @GetMapping("/courses/{id}")
    public ResponseEntity<Course> fetchACourse(@PathVariable("id") int id){
        ResponseEntity<Course> re = null;
        Optional<Course> courseFound = courseRepository.findById(id);
        if(courseFound.isPresent()){
            Course course = courseFound.get();
            re = new ResponseEntity<Course>(course, HttpStatus.OK);
        }
        else{
            // throw new CourseNotFoundException("");
            re= new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return re;
    }

    @GetMapping("/courses")
    public List<Course> fetchAllCourses() {
        return courseRepository.findAll();
    }
    @DeleteMapping("/courses/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCourse(@PathVariable("id") int id){
        courseRepository.deleteById(id);
    }

    @PatchMapping("/courses/{id}")
    public Course updatCourse(@PathVariable("id") int id, @RequestBody Course newCourse){
        // find the course by given id
        Course course = null;
        Optional<Course> courseFound = courseRepository.findById(id);
        if(courseFound.isPresent()){
            course = courseFound.get();
           // update the found course with newCourse values
           course.setPrice(newCourse.getPrice());
           course.setTitle(newCourse.getTitle());
        }
        else{
             throw new CourseNotFoundException("Course not found with ID: " + id);   
        }
        courseRepository.save(course);
        return course;
    }
    
    
}
