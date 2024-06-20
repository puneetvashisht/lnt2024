package com.lnt.spring_boot_db_demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lnt.spring_boot_db_demo.entities.Course;



public interface CourseRepository extends JpaRepository<Course, Integer>{
    Course findByTitle(String title);
    Course findCourseDistictByTitleAndPrice(String title, Double price);
    List<Course> findCourseByOrderByTitleAsc();
    List<Course> findByPriceGreaterThan(double price);

        // Custom JPQL query to find users by age range
    @Query("SELECT c FROM Course c WHERE c.price BETWEEN :minPrice AND :maxPrice ORDER BY c.title ASC")
    List<Course> findCourseByPriceQuery(double minPrice, double maxPrice);
   // findByPriceAndTitle
}
