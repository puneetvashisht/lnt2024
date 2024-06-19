package com.lnt.spring_boot_db_demo.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CourseNotFoundException extends RuntimeException{
    public CourseNotFoundException(String message){
        super(message);
    }
}
