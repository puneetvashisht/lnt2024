package com.threads;

public class MyTask implements Runnable {

    @Override
    public void run() {
       System.out.println("Run by " + Thread.currentThread().getName());
    }
    
}
