package com.lnt.spring_boot_db_demo3.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.lnt.spring_boot_db_demo3.entities.Product;
import com.lnt.spring_boot_db_demo3.repos.ProductRepository;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/api/v1")
@Slf4j
public class ProductController {
// Logger log = LoggerFactory.getLogger(ProductController.class);



    @RequestMapping("/")
    public String index() {
       log.trace("A TRACE Message");
       log.debug("A DEBUG Message");
       log.info("An INFO Message");
       log.warn("A WARN Message");
       log.error("An ERROR Message");

        return "Howdy! Check out the Logs to see the output...";
    }

    @Autowired
    ProductRepository productRepository;

    @PostMapping("/products")
    public void addProduct(@RequestBody Product product){
        productRepository.save(product);
    }

    @GetMapping("/products")
    public List<Product> fetchProducts() {
        List<Product> products = productRepository.findAll();
        log.debug(products.toString());
        return products;
    }
    
    
}
