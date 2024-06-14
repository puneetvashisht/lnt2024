package com.exceptions;

import java.io.FileNotFoundException;

public class ExceptionsDemo {

    public static void m2(int x){
        // int y = 1/x;
        if(x<1){
            throw new EmployeeNotFound("x should not be less than 1!");
        }
        else if(x == 100){
            throw new RuntimeException("x should not be 100!");
        }
        System.out.println("m2 invoked..");
    }

    public static void m1(){
        // System.out.println("m1 invoked..");
        // try{
            // try {
                m2(0);
            // } catch (EmployeeNotFound e) {
            //     // TODO Auto-generated catch block
            //     e.printStackTrace();
            // }
            System.out.println("This should not print");
        // }
        // catch(ArithmeticException e){
        //     // m2(1);
        //     e.printStackTrace();
        // }
        // catch(Exception e){
        //     System.out.println("Some other exception");
        //     e.printStackTrace();
        // }
        // finally{
        //     System.out.println("Finally always executes!");
        // }
      
       
    }


    public static void main(String[] args) {
        // try{
            try {
                m1();
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        // }
        // catch(Exception e){
        //     System.out.println("Some other exception");
        //     e.printStackTrace();
        // }
        System.out.println("allz well...");
    }
    
}
