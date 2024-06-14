package com.threads;

public class MyRunnable implements Runnable{

    @Override
    public void run() {
       System.out.println("Being run by "+ Thread.currentThread().getName());
    }
    
}
