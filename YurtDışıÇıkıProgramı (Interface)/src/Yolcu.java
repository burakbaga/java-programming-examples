
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bagat
 */
public class Yolcu implements IYurtDisiKurallari {

    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yatırdığımız harç bedeli : ");

        this.harc = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Siyasi yasaınız bulunuyor mu=");

        String cevap = scanner.nextLine();

        if (cevap.equals("evet")) {
            this.siyasiYasak = true;
        }else{
            this.siyasiYasak = false;
        }
        
        System.out.println("Vizenin bulunuyor mu?");
        
        String cevap2 = scanner.nextLine();
        
          if (cevap2.equals("evet")) {
            this.vizeDurumu = true;
        }else{
            this.vizeDurumu = false;
        }

    }

    @Override
    public boolean yurdisiHarciKontrol() {
        
        if(this.harc<15){
            System.out.println("Lütfen yurtdışı harcını tam yatırın.");
            return false;
        }else {
            System.out.println("yurt dışı harcı tamam");
            return true;
        }

    }

    @Override
    public boolean siyasiYasakKontrol() {
        if(siyasiYasak==true){
            System.out.println("Çıkamazsın ");
            return false;
            
        }else{
            System.out.println("Yasak yok çıkabilirisin");
            return true;
        }
        
    }

    @Override
    public boolean vizeDurumuKontrol() {
        if(this.vizeDurumu==true){
            System.out.println("Vize işlemleri tamam");
            return true;
        }else {
            System.out.println("Vizen yok");
            return false;
        }
    }

}
