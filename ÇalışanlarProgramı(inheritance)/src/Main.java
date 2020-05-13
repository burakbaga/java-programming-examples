
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String islemler = "1. Yazilimci islemleri \n"
                + "2.Yönetici işlemleri \n"
                + "3.Çıkış için q ya basın \n";

        System.out.println("******************************");
        System.out.println(islemler);

        while (true) {
            System.out.println("İşlem seçin");
            String islem = scan.nextLine();

            if (islem.equals("q")) {
                break;
            } else if (islem.equals("1")) {
                Yazilimci yazilimci = new Yazilimci("Burak", "Bagatarhan", 1521, "python,java");

                String yazilimci_islem = "1. Format At \n"
                        + "2. Bilgileri Göster" + "Çıkıi için q ya basın";

                System.out.println(yazilimci_islem);
                while (true) {
                    System.out.println("İşlem seç");
                    String y_islem = scan.nextLine();

                    if (y_islem.equals("q")) {
                        System.out.println("Çıkılıyor");
                        break;
                    } else if (y_islem.equals("1")) {
                        System.out.println("İşletim sistemi..");

                        String isletim_sistemii = scan.nextLine();

                        yazilimci.formatAt(isletim_sistemii);

                    } else if (y_islem.equals("2")) {
                        yazilimci.bilgileriGoster();
                    } else {
                        System.out.println("Geçersiz işlem..");
                    }
                }

            } else if (islem.equals("2")) {

                Yonetici yonetici = new Yonetici("ahmet", "say", 123, 10);

                String yonetici_islemleri = "1. Zam yap \n"
                        + "2. Bilgileri Göster" + "Çıkıi için q ya basın";
                System.out.println(yonetici_islemleri);

                while (true) {

                    System.out.println("İşlem seç ");

                    String y_islem = scan.nextLine();

                    if (y_islem.equals("q")) {
                        System.out.println(" yönetic Çıkılıyor");
                        break;
                    } else if (y_islem.equals("1")) {
                        System.out.println("Ne kadar zam yapılsın");
                        int zam = scan.nextInt();
                        scan.nextLine();

                        yonetici.zamYap(zam);

                    }else if (y_islem.equals("2"))
                    {
                        yonetici.bilgileriGoster();
                    }

                }

            }

        }

    }
}
