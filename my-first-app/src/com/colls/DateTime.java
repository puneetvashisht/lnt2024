package com.colls;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZonedDateTime;

public class DateTime {
    public static void main(String[] args) {
        
        System.out.println(LocalTime.now());
        System.out.println(ZonedDateTime.now());
        System.out.println(Instant.now());
        // Instant.now
    }
    
}
