package com.threads;

public class ThreadDemo2 {
    // Create 3 threads and run

    public static void main(String[] args) {
        
        // Thread object needs a Runnable implementation

        for(int i=0;i<3;i++){
            Runnable task = new MyTask();
            Thread t = new Thread(task);
            // start a thread
            t.start();
        }
       
    }
}
