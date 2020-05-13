
public class Yonetici extends Calisan {

    private int sorumlu_kisi;

    public Yonetici(String isim, int maas, String departman, int sorumlu_kisi) {

        super(isim, maas, departman);
        this.sorumlu_kisi = sorumlu_kisi;
    }

    public void zamYap(int miktar) {
        System.out.println("Çalışanlara " + miktar + " tl zam yapıldı.");
    }

    @Override
    public void bilgileriGoster() {
        /*System.out.println("İsim: " + getIsim());
        System.out.println("Maas: " + getMaas());
        System.out.println("Departman: " + getDepartman());*/
        
        super.bilgileriGoster();
                
                
        System.out.println("Sorumlu kişi sayısı : " + sorumlu_kisi);

    }

}
