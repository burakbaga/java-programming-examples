/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.burak.thread1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bagat
 */
public class Printer extends Thread {

    private String isim;

    public Printer(String isim) {
        this.isim = isim;
    }

    @Override
    public void run() {

        System.out.println(isim + " çalışıyor");

        for (int i = 1; i <= 10; i++) {
            try {
                System.out.println(isim + " yazıyor : " + i);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Thread kesintiye uğradı.");
            }

        }

        System.out.println(isim + " işini bitirdi.");

    }

}
