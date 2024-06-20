package com.lnt.spring_boot_db_demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lnt.spring_boot_db_demo.entities.Course;



public interface CourseRepository extends JpaRepository<Course, Integer>{
    Course findByTitle(String title);
    Course findCourseDistictByTitleAndPrice(String title, Double price);
    List<Course> findCourseByOrderByTitleAsc();
    List<Course> findByPriceGreaterThan(double price);
   // findByPriceAndTitle
}
