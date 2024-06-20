package com.example.PageableAndSort;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

    // Find all users with pagination
    Page<User> findAll(Pageable pageable);

    // Find all users with sorting
    List<User> findAll(Sort sort);

    // Find users by age greater than with pagination and sorting
    Page<User> findByAgeGreaterThan(int age, Pageable pageable);
}

