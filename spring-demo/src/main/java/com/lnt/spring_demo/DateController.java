package com.lnt.spring_demo;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
 @RequestMapping(path="/test")
public class DateController {
    @RequestMapping(path="/hello", method=RequestMethod.GET)
    public String sayHello(){
        
        return "Hello from Server!" + LocalDateTime.now();
    }
    
}
