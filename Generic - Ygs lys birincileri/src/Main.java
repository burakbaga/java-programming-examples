
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Ygs lys birinci bulma");

        Scanner scanner = new Scanner(System.in);

        String islemler = "İşlemler \n"
                + "1 Eşitağırlı biirincisi \n"
                + "2 sayısallaron birincisi\n"
                + "q ya bas\n";

        while (true) {

            System.out.println("Birinci ogrenci ismi");
            String isim1 = scanner.nextLine();

            System.out.println("Netler...");
            int turkce1 = scanner.nextInt();
            int mat1 = scanner.nextInt();
            int ed1 = scanner.nextInt();
            int fiz1 = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Birinci ogrenci ismi");
            String isim2 = scanner.nextLine();

            System.out.println("Netler...");
            int turkce2 = scanner.nextInt();
            int mat2 = scanner.nextInt();
            int ed2 = scanner.nextInt();
            int fiz2 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Birinci ogrenci ismi");
            String isim3 = scanner.nextLine();

            System.out.println("Netler...");
            int turkce3 = scanner.nextInt();
            int mat3 = scanner.nextInt();
            int ed3 = scanner.nextInt();
            int fiz3 = scanner.nextInt();
            scanner.nextLine();

            System.out.println(islemler);

            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                break;
            } else if (islem.equals("1")) {
                EsitAgirlik ogrenci1 = new EsitAgirlik(turkce1, mat1, ed1, fiz1, isim1);
                EsitAgirlik ogrenci2 = new EsitAgirlik(turkce2, mat2, ed2, fiz2, isim2);
                EsitAgirlik ogrenci3 = new EsitAgirlik(turkce3, mat3, ed3, fiz3, isim3);

            } else if (islem.equals("2")) {

                EsitAgirlik ogrenci1 = new EsitAgirlik(turkce1, mat1, ed1, fiz1, isim1);
                EsitAgirlik ogrenci2 = new EsitAgirlik(turkce2, mat2, ed2, fiz2, isim2);
                EsitAgirlik ogrenci3 = new EsitAgirlik(turkce3, mat3, ed3, fiz3, isim3);

                EsitAgirlik birinci = hesapla(ogrenci1,ogrenci2,ogrenci3);

            } else {
                System.out.println("Geçersiz.... ");
            }

        }

    }

    public static <E extends Aday> E hesapla(E e1, E e2, E e3) {

        if (e1.puanHesapla() > e2.puanHesapla() && e1.puanHesapla() > e3.puanHesapla()) {
            return e1;
        } else if (e2.puanHesapla() > e1.puanHesapla() && e2.puanHesapla() > e3.puanHesapla()) {
            return e2;
        } else if (e3.puanHesapla() > e2.puanHesapla() && e3.puanHesapla() > e1.puanHesapla()) {
            return e3;
        } else {
            return e1;
        }

    }

}
