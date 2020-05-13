package ArrayListMain;

import java.util.ArrayList;
import java.util.List;

public class java {

    public static void main(String[] args) {

       // ArrayList<String> arrayList = new ArrayList<String>();
       
       List<String> list = new ArrayList<String>();
       
       list.add("Java");
       list.add("Python");
       list.add("C++");
       
        //System.out.println(list.get(0)); 
        
        for(int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        list.remove("Java");
        list.remove(1);
        
        for(String s : list){
            System.out.println(s);
        }
       
        
       
    }

}
