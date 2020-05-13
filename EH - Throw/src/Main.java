
import java.util.Scanner;

public class Main {

    public static void mekanKontrol(int yas) {
        if (yas < 18) {
            throw new ArithmeticException();
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen yaş girin..");

        int yas = scanner.nextInt();
        try {
            mekanKontrol(yas);

        } catch (ArithmeticException e) {
            System.out.println("18 yaşından küçükler mekana giremez.");
        }

    }
}
