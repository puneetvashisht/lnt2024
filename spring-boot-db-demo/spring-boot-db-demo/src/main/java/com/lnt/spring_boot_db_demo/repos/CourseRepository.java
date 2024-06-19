package com.lnt.spring_boot_db_demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lnt.spring_boot_db_demo.entities.Course;



public interface CourseRepository extends JpaRepository<Course, Integer>{
    Course findByTitle(String title);
   // findByPriceAndTitle
}
