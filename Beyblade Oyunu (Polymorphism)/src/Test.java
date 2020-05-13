
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        
        System.out.println("Hoşgeldiniz..");
        
        System.out.println("Çıkış için q ya bas");
        
        Scanner scan = new Scanner(System.in);
        
        while(true){
            System.out.println("Hangi beyblade istiyorsun ");
            String islem = scan.nextLine();
            
            if (islem.equals("q")){
                break;
            }
            
            else {
                BeybladeFabrikasi fabrika = new BeybladeFabrikasi();
                Beyblade beyblade = fabrika.beybladeUret(islem);
                
                if (beyblade == null){
                    System.out.println("geçerli isim girin");
                }
                else {
                    beyblade.bilgileriGoster();
                    beyblade.saldir();
                    beyblade.kutsalCanavarOrtayaCikar();
                }
                
                
            }
            
        
        }
        
        
        
        
    }
    
}
