
public class Yonetici extends Calisan{
    private int sorumlu_kisi_sayisi;

    public Yonetici(String ad, String soyad, int id,int sorumlu_kisi_sayisi) {
        super(ad, soyad, id);
        this.sorumlu_kisi_sayisi = sorumlu_kisi_sayisi;
    }
    
    @Override 
    public void bilgileriGoster(){
        super.bilgileriGoster();
        System.out.println("Sorumlu olduğu kişi sayısı : "+sorumlu_kisi_sayisi);
    }
    
    public void zamYap(int tutar){
        System.out.println(getAd()+" çalışanlara "+tutar+" tl zam yaptı..");
    }
    
}
