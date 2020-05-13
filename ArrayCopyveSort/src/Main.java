
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] arrayi_doldur(int sayi) {
        Scanner scanner = new Scanner(System.in);

        int[] cikti = new int[sayi];

        for (int i = 0; i < sayi; i++) {

            cikti[i] = scanner.nextInt();

        }

        return cikti;

    }

    public static void array_bastir(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element" + (i + 1) + " :" + arr[i]);
        }
    }

    public static void array_sort(int[] array) {
        Arrays.sort(array);
    }

    public static void main(String[] args) {
        /*
        int [] array = arrayi_doldur(5);
        
        array_sort(array);
        array_bastir(array);*/

        int[] a1 = {1, 2, 3, 4, 5, 6};
        int[] a2 = {1, 2, 3, 4, 5, 6};

        if (Arrays.equals(a1, a2)) {
            System.out.println("Eşitler");
        }

    }

}
