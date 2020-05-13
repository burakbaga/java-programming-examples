
import java.util.Scanner;
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
public class WaitNotify {

    private Object lock = new Object();
    private Object lock2 = new Object();

    public void t3Fonksiyonu() {

        synchronized (lock2) {
            System.out.println("Thread 3 Çalışıyor.");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(WaitNotify.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    public void t1Fonksiyonu() {

        synchronized (lock) {
            System.out.println("Thread 1 Çalışıyor.");
            System.out.println("Thread 1 Thread 2 nin kendisini uyandırmasını bekliyor.");
            try {
                lock.wait();

            } catch (InterruptedException ex) {
                Logger.getLogger(WaitNotify.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Thread 1 uyandı devam ediyor.");
        }

    }

    public void t2Fonksiyonu() {
        Scanner scanner = new Scanner(System.in);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(WaitNotify.class.getName()).log(Level.SEVERE, null, ex);
        }

        synchronized (lock) { // this şeklinde kullanılabilir ancak bunu yerine lock oluşturmak daha sağlıklı
            System.out.println("Thread 2 çalışıyor.");
            System.out.println("Devam etmek için bir tuşa basın.");

            scanner.nextLine();
            lock.notify();
            System.out.println("Uyandırdım ben gidiyorum ama 2 saniye bekle.");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException ex) {
                Logger.getLogger(WaitNotify.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

}
