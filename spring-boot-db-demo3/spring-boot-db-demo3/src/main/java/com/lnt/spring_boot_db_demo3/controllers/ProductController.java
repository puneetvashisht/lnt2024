package com.lnt.spring_boot_db_demo3.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.lnt.spring_boot_db_demo3.entities.Product;
import com.lnt.spring_boot_db_demo3.repos.ProductRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
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
//@Slf4j
public class ProductController {
 Logger log = LoggerFactory.getLogger(ProductController.class);

@Operation(summary = "Get a book by its id")
@ApiResponses(value = { 
  @ApiResponse(responseCode = "200", description = "Found the book", 
    content = { @Content(mediaType = "application/json", 
      schema = @Schema(implementation = Product.class)) }),
  @ApiResponse(responseCode = "400", description = "Invalid id supplied", 
    content = @Content), 
  @ApiResponse(responseCode = "404", description = "Book not found", 
    content = @Content) })

    @GetMapping("/")
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
