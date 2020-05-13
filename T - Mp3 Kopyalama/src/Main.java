
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static ArrayList<Integer> icerik = new ArrayList<Integer>();

    public static void dosyaOku() {
        try {
            FileInputStream in = new FileInputStream("marş.mp3");

            int oku;

            while ((oku = in.read()) != -1) {
                icerik.add(oku);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void kopyala(String dosyaismi) {
        try {
            FileOutputStream out = new FileOutputStream(dosyaismi);

            for (int deger : icerik) {
                out.write(deger);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {
        dosyaOku();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                kopyala("mars1.mp3");
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                kopyala("mars2.mp3");
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                kopyala("mars3.mp3");
            }
        });

        long baslangic = System.currentTimeMillis();

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        long bitis = System.currentTimeMillis();

        System.out.println("Toplam geçen süre: " + (bitis - baslangic));

    }

}
