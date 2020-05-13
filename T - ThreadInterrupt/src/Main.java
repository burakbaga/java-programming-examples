
import java.util.LinkedList;
import java.util.List;
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

        List<Integer> list = new LinkedList<Integer>();

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread çalışıyor.");

                for (int i = 0; i < 10000000; i++) {
                    if (Thread.currentThread().isInterrupted()) {
                        System.out.println("Kesintiye uğradı.");
                        return;

                    }
                    list.add(i);

                }
                
                
                System.out.println("iş bitti.");

                /*
                for (int i = 1; i <= 10; i++) {
                    try {
                        System.out.println("Thread yazıyor..");
                        Thread.sleep(1000);
                        System.out.println("Uykumun "+i+". saniyesindeyim");
                    } catch (InterruptedException ex) {
                        System.out.println("Uykum bölündü.");
                    }
                }*/
            }
        });

        t.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        t.interrupt();

    }

}
