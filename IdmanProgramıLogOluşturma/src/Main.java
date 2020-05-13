
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

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

        Idman idman = new Idman(burpee, pushup, situp, squat);

        System.out.println("Idman başlıyor...");
        int i = 1;
        try (FileWriter writer = new FileWriter("log.txt")) {

            writer.write("Idman Programı\n");
            writer.write("Burpee Sayısı : " + idman.getBurpee_sayisi());
            writer.write("pushup Sayısı : " + idman.getPushup_sayisi());
            writer.write("situp Sayısı : " + idman.getSitup_sayisi());
            writer.write("squat Sayısı : " + idman.getSquat_sayisi());

            while (idman.idmanBittiMi() == false) {
                System.out.println("Hareket türü :");
                String tur = scanner.nextLine();
                System.out.println("Kaç kere yapacaksın");
                int sayi = scanner.nextInt();
                scanner.nextLine();

                idman.hareketYap(tur, sayi);

                writer.write(i + ".işlem ----- Hareket " + tur + " sayı " + sayi);
                i++;

            }
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
