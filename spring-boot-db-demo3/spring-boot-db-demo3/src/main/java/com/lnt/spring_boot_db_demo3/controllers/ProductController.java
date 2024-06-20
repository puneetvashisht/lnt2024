package com.lnt.spring_boot_db_demo3.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.lnt.spring_boot_db_demo3.entities.Product;
import com.lnt.spring_boot_db_demo3.repos.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("/api/v1")
public class ProductController {
    @Autowired
    ProductRepository productRepository;

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product){
        productRepository.save(product);
    }
    
}
