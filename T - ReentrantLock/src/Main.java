
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bagat
 */
public class Main {

    public static void main(String[] args) {

        ReentrantLockOrnegi re = new ReentrantLockOrnegi();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                re.thread1Fonksiyonu();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                re.thread2Fonksiyonu();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();

            t2.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        re.threadOver();

    }
}
