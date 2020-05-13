
import java.util.LinkedList;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {
        
        
        Queue<String> queue = new LinkedList<String>();
        
        queue.offer("Java");
        queue.offer("Php");
        queue.offer("Python");
        queue.offer("C++");
        
        System.out.println(queue.peek());
        
       for(String s: queue){
           System.out.println(s);
       }
        
        
        
        
        
    }
    
}
