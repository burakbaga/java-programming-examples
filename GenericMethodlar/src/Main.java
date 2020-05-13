
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Sayisal sayisal1 = new Sayisal(30, 40, 20, 30);
        Sayisal sayisal2 = new Sayisal(25, 45, 2, 35);

        EsitAgirlik esit1 = new EsitAgirlik(50, 40, 10, 40);
        EsitAgirlik esit2 = new EsitAgirlik(40, 45, 20, 42);

        EsitAgirlik ebir = hesapla(esit1, esit2);

        Sayisal birinci = hesapla(sayisal1, sayisal2);

        System.out.println("Birincinin puanı : " + birinci.puanHesapla());

        System.out.println("Birincinin puanı : " + ebir.puanHesapla());

        /*
        Character[] char_dizi = {'J', 'A', 'V', 'A'};
        Integer[] int_dizi = {1, 2, 3, 4, 5, 6};

        String[] string_dizi = {"Java", "python", "c++", "php"};

        Ogrenci[] ogrenci_dizi = {new Ogrenci("Burak"), new Ogrenci("Mustafa"), new Ogrenci("Merve")};

        yazdir(string_dizi);
        yazdir(ogrenci_dizi);
        yazdir(int_dizi);
        yazdir(char_dizi);
        
    }

    public static <E> void yazdir(E[] dizi) {
        for (E e : dizi) {
            System.out.println(e);
        },

         */
    }

    public static <E extends Aday> E hesapla(E e1, E e2) {

        if (e1.puanHesapla() > e2.puanHesapla()) {
            return e1;
        } else {
            return e2;
        }
    }

}
