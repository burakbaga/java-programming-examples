
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    // Apandist -- yuksek onceli 
    // yanik ---- orta öncelik 
    /// baş ağrısı -- düşük öncelik 
    public static void main(String[] args) {
        Hasta h1 = new Hasta("Burak", "Bas");
        Hasta h2 = new Hasta("Hasan", "Apandisit");
        Hasta h3 = new Hasta("mehmet", "Yanık");
        Hasta h4 = new Hasta("veli", "Apandisit");
        Hasta h5 = new Hasta("ali", "Yanık");

        Queue<Hasta> queue = new PriorityQueue<Hasta>();

        queue.offer(h1);
        queue.offer(h2);
        queue.offer(h3);
        queue.offer(h4);
        queue.offer(h5);
        
        

        while(!queue.isEmpty()){
            
            System.out.println(queue.poll());
            
            
            
            
        }
        
    }

}
