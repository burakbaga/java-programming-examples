
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        
     Scanner scanner = new Scanner(System.in);
     
        System.out.println("İdman programına hoşgeldiniz");
        
        String idmanlar = "Burpee \n Pushup \n situp \n squat";
        
        System.out.println(idmanlar);
        
        System.out.println("Burpee sayisi");
        int burpee = scanner.nextInt();
        System.out.println("pushup sayisi");
        int pushup = scanner.nextInt();
        System.out.println("situp sayisi");
        int situp = scanner.nextInt();
        System.out.println("squat sayisi");
        int squat = scanner.nextInt();
        scanner.nextLine();
        
        Idman idman = new Idman(burpee,pushup,situp,squat);
        
        System.out.println("Idman başlıyor...");
        
        while(idman.idmanBittiMi()==false){
            System.out.println("Hareket türü :");
            String tur = scanner.nextLine();
            System.out.println("Kaç kere yapacaksın");
            int sayi = scanner.nextInt();
            scanner.nextLine();
            
            idman.hareketYap(tur,sayi);
            
            
        }
        
    }
    
}
