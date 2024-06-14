package com.exceptions;

public class EmployeeNotFound extends RuntimeException{

    public EmployeeNotFound(){

    }
    public EmployeeNotFound(String message){
        super(message);
    }
    
}
