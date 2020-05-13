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

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Hoşgeldiniz...");

        String mesaj = "şartları sağla";

        while (true) {
            System.out.println(mesaj);

            Yolcu yolcu = new Yolcu();

            System.out.println("Harç bedeli kontrol ediliyor. ");
            Thread.sleep(3000);

            if (yolcu.yurdisiHarciKontrol() == false)
            {
                System.out.println(mesaj);
                continue;
            }

            System.out.println("Siyasi yasak kontrol et");
            Thread.sleep(3000);
            
            if(!yolcu.siyasiYasakKontrol()){
                System.out.println(mesaj);
                continue;
            }
            
            System.out.println("Vize durumu kontrol ediliyorr....");
            
            if(!yolcu.vizeDurumuKontrol()){
                System.out.println(mesaj);
                continue;
            }
            
            System.out.println("İşlemler tamam iyi yolculuklar....");
            break;
        }

    }
}
