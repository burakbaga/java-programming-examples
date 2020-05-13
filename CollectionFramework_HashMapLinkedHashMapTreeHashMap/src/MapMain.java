
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapMain {

    public static void mapYazdir(Map<Integer, String> map) {
        map.put(10, "c++");
        map.put(5, "java");
        map.put(1, "php");
        map.put(2, "python");
        map.put(100, "C");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Anahtar :" + entry.getKey() + " Key : " + entry.getValue());
        }
           System.out.println("*********************");
        System.out.println(map.keySet());          
        System.out.println(map.values());
    }

    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        Map<Integer, String> linkedhashmap = new LinkedHashMap<Integer, String>();
        Map<Integer, String> treemap = new TreeMap<Integer, String>();

        mapYazdir(hashMap);
        mapYazdir(linkedhashmap);
        mapYazdir(treemap);

    }
}
