
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        ArrayList<String> arrayList = new ArrayList<String>();
        
        ArrayList<Integer> arraylist2 = new ArrayList<Integer>();
        
        for (int i = 0; i < 10; i++) {
            arraylist2.add(Integer.valueOf(i*4)); // AUTOBOXING
            
        }
        
        for (int i = 0; i < arraylist2.size(); i++) {
            
            System.out.println(arraylist2.get(i).intValue()); // Unbxing
            
        }
        
       
    }
}
