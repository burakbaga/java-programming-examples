
import java.util.Scanner;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReentrantLockOrnegi {

    private int say = 0;
    private Lock lock = new ReentrantLock();
    private Condition condition = lock.newCondition();

    public void arttir() {

        for (int i = 0; i < 10000; i++) {
            say++;

        }
    }

    public void thread1Fonksiyonu() {
        lock.lock();
        System.out.println("Thread 1 çalışıyor.");

        try {
            System.out.println("Thread 1 uyandırılmayı bekliyor.");

            condition.await();
        } catch (InterruptedException ex) {
            Logger.getLogger(ReentrantLockOrnegi.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Thread 1 uyandırıldı ve işleme devam ediyor.");
        arttir();
        lock.unlock();

    }

    public void thread2Fonksiyonu() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ReentrantLockOrnegi.class.getName()).log(Level.SEVERE, null, ex);
        }
        Scanner scanner = new Scanner(System.in);
        lock.lock();
        System.out.println("Thread 2 çalışıyor");

        arttir();
        System.out.println("Devam etmek için bir tuşa bas");
        scanner.nextLine();
        condition.signal();

        System.out.println("Thread 1 uyandırıldı.");

        lock.unlock();
    }

    public void threadOver() {
        System.out.println("Say degeri : " + say);

    }
}
