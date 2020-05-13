
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

        WaitNotify wn = new WaitNotify();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                wn.t1Fonksiyonu();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                wn.t2Fonksiyonu();
            }
        });

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                wn.t3Fonksiyonu();
            }
        });
        t3.start();

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
            t3.join();

        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
