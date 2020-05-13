
public class Hayvan {

    private String isim;
    private int kilo;
    private int boy;
    private int bacak_sayisi;

    public Hayvan(String isim, int kilo, int boy, int bacak_sayisi) {
        this.isim = isim;
        this.kilo = kilo;
        this.boy = boy;
        this.bacak_sayisi = bacak_sayisi;
    }

    public void yemekYe() {
        System.out.println("Hayvan şuanda yemek yiyor.");
    }

    public void hareketeGec(int hiz) {
        System.out.println("Hayvan " + hiz + " ile hareket ediyor. ");

    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getIsım() {
        return isim;

    }

    public void setBoy(int boy) {
        this.boy = boy;
    }

    public int getBoy() {
        return boy;
    }

    public void setKilo(int kilo) {
        this.kilo = kilo;
    }

    public int getKilo() {
        return kilo;
    }

    public void setBacak_sayisi(int bacak_sayisi) {
        this.bacak_sayisi = bacak_sayisi;
    }

    public int getBacak_sayisi(int bacak_sayisi) {
        return bacak_sayisi;
    }
}
