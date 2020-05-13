
public class PcMuhendisi implements IMuhendis{

    private boolean askerlik;
    private boolean adli_sicil;
    
    public PcMuhendisi(boolean askerlik,boolean adli_sicil){
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }
    
    @Override
    public void askerlik_durumu_sorgula() {
        if (askerlik){
            System.out.println("Askerliğimi yaptım.");
        }else {
            System.out.println("Askerliğimi henüz yapmadım.");
        }
    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {
        return "Ortalamam : "+derece;
    }

    @Override
    public void adli_sicil_sorgula() {
        if(adli_sicil){
            System.out.println("Adli sicil kaydım bulunuyor.");
        }else 
            System.out.println("Adli sicil kaydım bulunmuyor.");
        
    }

    @Override
    public void is_tecrubesi(String[] array) {
        System.out.println("Bilgisayar mühendisi olarak şu şirketlerde çalıştım. ");
        for(String i : array){
            System.out.println(i);
        }
    }
    
}
