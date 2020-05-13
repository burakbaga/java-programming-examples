
import java.util.HashMap;
import java.util.Map;

public class HashMapMain {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

        hashMap.put(10, "Java");
        hashMap.put(30, "Python");
        hashMap.put(50, "PHP");
        hashMap.put(20, "PHP");

        hashMap.put(50, "Javascript");
        
        System.out.println(hashMap);
        
        
        System.out.println(hashMap.get(50));
        
        for(Map.Entry<Integer,String> entry : hashMap.entrySet()){
            System.out.println("Anahatar "+entry.getKey()+"key :"+entry.getValue());
        }
       
        
        

    }
}
