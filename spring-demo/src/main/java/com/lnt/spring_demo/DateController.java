package com.lnt.spring_demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
 @RequestMapping(path="/test")
public class DateController {

    @Autowired
    A a;

    @RequestMapping(path="/hello", method=RequestMethod.GET)
    public String sayHello(){
        a.execute();
        return "Hello from Server!" + LocalDateTime.now();
    }
    
}
