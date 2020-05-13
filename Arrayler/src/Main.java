
import java.util.Scanner;

public class Main {

    public static void array_bastir(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static double ortalama_bul(int[] array) {
        int toplam = 0;
        for (int i = 0; i < array.length; i++) {
              toplam+=array[i];
        }
        
        return ((double)toplam/array.length);
    }

    public static void main(String[] args) {

        int[] a = new int[5];

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            a[i] = scanner.nextInt();

        }

        array_bastir(a);
        double k = ortalama_bul(a);
        System.out.println(k);
        

    }

}
