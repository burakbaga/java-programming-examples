
public class Kare extends Sekil {

    private int kenar;

    public Kare(String isim, int kenar) {
        super(isim);
        this.kenar = kenar;
    }

    @Override
    void alan_hesapla() {
        
        System.out.println(getIsim()+"Alanı "+ (kenar*kenar));


    }
    
    public void cevreHesapla(){
        System.out.println(getIsim()+" çevresi "+(4*kenar));
    }

}
