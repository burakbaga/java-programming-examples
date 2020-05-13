
import java.util.Scanner;


public class Main {
    
    public static void selam(){
        System.out.println("Selam");
    }
    
    
    public static void fakt(){
        Scanner scan = new Scanner(System.in);
        int toplam =1;
        int sayi = scan.nextInt();
        
        for (int i =1;i<=sayi;i++){
          toplam*=i;
        }
        System.out.println(toplam);
        
    }
    
    public static void fakt(int sayi){
        int toplam =1;
         for (int i =1;i<=sayi;i++){
          toplam*=i;
        }
        System.out.println(toplam);
    }
    
    public static int refakt(int sayi){
        
        int toplam =1;
        
        while (sayi>0){
            toplam*=sayi;
            sayi--;
            
        }
        return toplam;
    }
    public static void main(String[] args) {
        int toplam = refakt(5);
        System.out.println(toplam);
    }
    
}
