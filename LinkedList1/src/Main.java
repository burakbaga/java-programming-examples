
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {

    public static void listebas(LinkedList<String> gidilecek_yerler) {
        /* for (String i : gidilecek_yerler){
            System.out.println(i);
                   
        }*/

        ListIterator<String> iterator = gidilecek_yerler.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
    
    
    public static void sirali_ekle(LinkedList<String> gidilecek,String yeni){
        
        ListIterator <String> iterator = gidilecek.listIterator();
        
        while(iterator.hasNext()){
            int karsilastir = iterator.next().compareTo(yeni);
            
            if (karsilastir == 0){
                System.out.println("Listenizde bu elaman zaten var");
                return;
            }else if (karsilastir <0){
                // Yeni değer iterator.nexten daha büyük
            }
            else if (karsilastir>0){
                iterator.previous();
                iterator.add(yeni);
                return; // metodu sonlandır .... 
            }
            
            
        }
        
        iterator.add(yeni);
        
        
        
    }

    public static void main(String[] args) {
        
        
        LinkedList<String> gidilecek = new LinkedList<String>();
        
        sirali_ekle(gidilecek,"Postane");
        sirali_ekle(gidilecek, "Market");
        sirali_ekle(gidilecek, "Ev");
        
        listebas(gidilecek);

        
/*
        LinkedList<String> gidilecek_yerler = new LinkedList<String>();

        gidilecek_yerler.add("Postane");
        gidilecek_yerler.add("Market");
        gidilecek_yerler.add("Okul");
        gidilecek_yerler.add("Kütüphane ");

        gidilecek_yerler.add("Spor Salonu");
        gidilecek_yerler.add("Ev");

        listebas(gidilecek_yerler);

        gidilecek_yerler.add(4, "Alışveriş");


        listebas(gidilecek_yerler);

        gidilecek_yerler.remove(3);


        listebas(gidilecek_yerler);
*/
    }
}
