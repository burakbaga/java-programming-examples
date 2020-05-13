
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
public class Matematik {

    private double PI = Math.PI;

    public class Factorial { //inner class oluşturuldu.

        public void faktoriyel() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Bir sayı girin..");

            int sayi = scanner.nextInt();
            int fakt = 1;

            for (int i = 2; i <= sayi; i++) {
                fakt *= i;

            }
            System.out.println("Faktoriyek : " + fakt);

        }

    }

    public class Asal {

        public boolean asalmi(int sayi) {
            int i = 2;
            while (i < sayi) {
                if (sayi % i == 0) {
                    return false;
                }
                i++;
            }
            return true;
        }
    }

    public class Alan{
        public class DaireAlan{
        
          public void daire_alan(int yaricap){
            System.out.println("Daire alanı: "+(yaricap*yaricap*PI));
            
        }
        
    }
        
     
    }
}
