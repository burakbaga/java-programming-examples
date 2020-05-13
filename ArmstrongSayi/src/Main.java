
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
        
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Sayı Gir..");
        
        int sayi = scan.nextInt();
        int toplam = 0;
        System.out.println("Basamak sayisi gir..");
        
        int basamak_sayisi = scan.nextInt();
        
        int tmp = sayi;
        
        
        do {
            
            int basamak_degeri = tmp%10;
            
            tmp /=10;
            
            toplam += Math.pow(basamak_degeri,basamak_sayisi);
            
            
            
        }while(tmp>0);
        
        if (sayi==toplam){
            System.out.println("Arms.. sayidir");
        }else {
            System.out.println("degildir...");
        }
        
        
        
        
        
        
    }
    
    
}
