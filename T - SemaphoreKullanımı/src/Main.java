
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        SemaphoreOrnegi semaphore = new SemaphoreOrnegi();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                semaphore.threadFonksiyonu(1);
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                semaphore.threadFonksiyonu(2);
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                semaphore.threadFonksiyonu(3);
            }
        });
        Thread t4 = new Thread(new Runnable() {
            @Override
            public void run() {
                semaphore.threadFonksiyonu(4);
            }
        });
        Thread t5 = new Thread(new Runnable() {
            @Override
            public void run() {
                semaphore.threadFonksiyonu(5);
            }
        });

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
