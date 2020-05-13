
import java.io.Serializable;


public class Ogrenci implements Serializable {
    
    private String isim ;
    private transient int id; // transient yazıldığı için serileştirme yapılmıyor. varsayılan değerl ile okunur. 
    
    private String bolum;
    
    private static int ogrenci_sayisi;

    public static int getOgrenci_sayisi() {
        return ogrenci_sayisi;
    }

    public static void setOgrenci_sayisi(int ogrenci_sayisi) {
        Ogrenci.ogrenci_sayisi = ogrenci_sayisi;
    }
    
    
    
    public Ogrenci(String isim,int id ,String bolum){
        this.isim=isim;
        this.id=id;
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        return "Ogrenci" + "isim=" + isim + "\n id=" + id + "\n bolum=" + bolum + '}';
    }
    
    
   
    
    
    
    
    
    
    
}
