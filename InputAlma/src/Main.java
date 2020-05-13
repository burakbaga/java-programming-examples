
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        
        
        Scanner scan = new Scanner(System.in);;

        System.out.println("Boyunuzu giriniz.. ");
        double boy = scan.nextDouble();
        System.out.println("Kilonuzu giriniz? ");
        int kilo = scan.nextInt();

        double bki = kilo / (boy * boy);

        System.out.println("Beden kitle indexi : " + bki);

    }

}
