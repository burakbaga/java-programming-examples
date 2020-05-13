
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void mekanKontrol(int yas) throws IOException {
        if (yas < 18) {

            throw new IOException();

        }
    }

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen yaş girin..");

        int yas = scanner.nextInt();

        mekanKontrol(yas);

        /*try {
            mekanKontrol(yas);

        } catch (IOException e) {
            System.out.println("18 yaşından küçükler mekana giremez.");
        }
         */
    }
}
