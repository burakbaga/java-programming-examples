
class Hayvan {

    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String konus() {
        return "Hayvan konuşuyor..";
    }
}

class Kedi extends Hayvan {

    public Kedi(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " miyavlıyor...";
    }

}

class Kopek extends Hayvan {

    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " Havlıyor ";
    }
}

class At extends Hayvan {

    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + "Kişniyor";
    }

}

public class Main {

    public static void konustur(Hayvan hayvan) {
        System.out.println(hayvan.konus());
    }

    public static void main(String[] args) {
        /*
        
        Hayvan hayvan = new Hayvan("Limon");
        
        Hayvan kedi = new Kedi("Tekir");
        
        Hayvan hayvan2 = new Kopek("Karabaş");
        
        
        System.out.println(kedi.konus());
        System.out.println(hayvan2.konus());
         */

        // HERHANGİ BİR TÜR DÖNÜŞÜMÜ YAPMADAN AYNI METOD FARKLI TÜRLERİ GÖNDERMEMİZİ SAĞLAR...
        /*
        konustur(new Kedi("Tekir"));
        konustur(new Kopek("Kara"));
        konustur(new At("Şahbatur"));
         */
        Kopek kopek = new Kopek("Karabaş");

        if(kopek instanceof Kopek){
            System.out.println("Kopek sınıfından.. ");
        } 
        
        
        
        
    }

}
