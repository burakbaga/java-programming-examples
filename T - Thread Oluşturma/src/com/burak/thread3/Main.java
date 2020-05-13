
package com.burak.thread3;


public class Main {
    public static void main(String[] args) {
        
        System.out.println("Main class çalışıyor");
    
        Thread printer1 = new Thread(new Runnable() {
            @Override
            public void run() {
                
                System.out.println("Thread çalışıyor.");
                
            }
        });
        
        printer1.start();
        
    }
    
}
