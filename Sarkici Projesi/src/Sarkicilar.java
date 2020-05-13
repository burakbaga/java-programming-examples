
import java.util.ArrayList;

public class Sarkicilar {

    private ArrayList<String> sarkici_listesi = new ArrayList<String>();

    public void sarkicilari_bastir() {
        System.out.println("Şarkıcı listesinde " + sarkici_listesi.size() + " kadar şarkıcı var");

        for (int i = 0; i < sarkici_listesi.size(); i++) {
            System.out.println((i + 1) + ". şarkıcı " + sarkici_listesi.get(i));
        }
    }

    public void sarkiciEkle(String isim) {
        sarkici_listesi.add(isim);

        System.out.println("Şarkıcı listesi güncellendi...");
    }

    public void sarkıcı_guncelle(String yeni_isim, int index) {
        sarkici_listesi.set(index, yeni_isim);

        System.out.println("Şarkıcı listesi güncellendi");
    }

    public void sarkıcı_sil(int index) {
        String isim = sarkici_listesi.get(index);

        sarkici_listesi.remove(index);

        System.out.println(isim + " li şşarkıcı silindi...");
    }

    public void sarkıcı_ara(String sarkici_isim) {
        int index = sarkici_listesi.indexOf(sarkici_isim);

        if (index >= 0) {
            System.out.println("Şarkıcı bulundu");
            System.out.println(sarkici_isim + "isimli şarkıcı " + index + " pozisyonda");
        } else {
            System.out.println("Bulunamadı...");
        }

    }
}
