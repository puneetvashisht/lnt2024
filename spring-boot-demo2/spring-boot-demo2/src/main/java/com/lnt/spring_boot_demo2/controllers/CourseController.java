package com.lnt.spring_boot_demo2.controllers;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RestController;
import com.lnt.spring_boot_demo2.entities.Course;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
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
    
    @DeleteMapping("/courses/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCourse(@PathVariable("id") int id){
        System.out.println("Id to delete is : " + id);
        boolean notExist = false;
        for(int i=0; i<courses.size();i++){
           if(id == courses.get(i).id){
            System.out.println("Removing index "+ i);
                courses.remove(i);
                notExist = true;
                break;
           }
        }
        
        if(!notExist){
            throw new CourseNotFoundException("Course not found with id: "+ id);
        }

        // this.courses = courses.stream()
        // .filter(e -> e.id != id)
        // .toList();
    }


    @PatchMapping("/courses/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void changeCoursePrice(@PathVariable("id")int id, @RequestBody Course updatedCourse){
        for(Course c : courses){
            if(c.id == id){
                c.setPrice(updatedCourse.getPrice());
            }
        }
    }
}
