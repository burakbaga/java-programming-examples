
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

        System.out.println("Hoşgeldiniz...");

        String mesaj = "şartları sağla";

        while (true) {
            System.out.println(mesaj);

            Yolcu yolcu = new Yolcu();

            System.out.println("Harç bedeli kontrol ediliyor. ");

            try {
                yolcu.yurdisiHarciKontrol();
            } catch (HarcException ex) {
                ex.printStackTrace();
                continue;
            }

            System.out.println("Siyasi yasak kontrol et");

            try {
                yolcu.siyasiYasakKontrol();
            } catch (SiyasiException ex) {
                ex.printStackTrace();
                continue;

            }

            System.out.println("Vize durumu kontrol ediliyorr....");

            try {
                yolcu.vizeDurumuKontrol();
            } catch (VizeException ex) {
                ex.printStackTrace();
                continue;
            }

            System.out.println("İşlemler tamam iyi yolculuklar....");
            break;
        }

    }
}
