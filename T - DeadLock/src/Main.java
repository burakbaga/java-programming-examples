
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        DeadlockOrnegi deadlock = new DeadlockOrnegi();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                deadlock.thread1Fonksiyonu();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                deadlock.thread2Fonksiyonu();
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

        deadlock.threadOver();

    }
}
