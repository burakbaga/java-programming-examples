
import java.util.Iterator;


public class Main {

    public static void main(String[] args) {

        Kumanda kumanda = new Kumanda();

        kumanda.kanalEkle("atv");
        kumanda.kanalEkle("kanal d");
        kumanda.kanalEkle("trt");
        kumanda.kanalEkle("fox");
        kumanda.kanalEkle("tv8");
        
        for(String s : kumanda){
            System.out.println(s);
        }
        
        Iterator<String> iter = kumanda.iterator();
        
        
        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }
}
