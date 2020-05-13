package com.burak.thread2;

import com.burak.thread1.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("Main thread çalışıyor.");

        
        Thread printer1 = new Thread(new Printer("Printer 1 "));
        
        Thread printer2 = new Thread(new Printer("Printer 2"));
        
        
        printer1.start();
        printer2.start();
        
        
        
        
    }

}
