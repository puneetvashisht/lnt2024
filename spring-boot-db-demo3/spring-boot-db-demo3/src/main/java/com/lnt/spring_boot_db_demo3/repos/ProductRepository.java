package com.lnt.spring_boot_db_demo3.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lnt.spring_boot_db_demo3.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
    
}
