
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
public class ThreadSafe {

    private int count = 0;

    public synchronized void arttir( ) {
       
        count++;
    }

    public void threadleriCalistir() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {

                for (int i = 0; i < 5000; i++) {
                    arttir();

                }

            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5000; i++) {
                    arttir();

                }

            }
        });
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();

        } catch (InterruptedException ex) {
            Logger.getLogger(ThreadSafe.class.getName()).log(Level.SEVERE, null, ex);
        }

        System.out.println("Count değişkeni değeri : " + count);
    }

    public static void main(String[] args) {

        ThreadSafe threadsafe = new ThreadSafe();

        threadsafe.threadleriCalistir();

    }

}
