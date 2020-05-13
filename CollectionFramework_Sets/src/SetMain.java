
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetMain {

    public static void main(String[] args) {

        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new LinkedHashSet<String>();
        Set<String> set3 = new TreeSet<String>();

        set1.add("Java");
        set1.add("Python");
        set1.add("c++");
        set1.add("Javascript");
        set1.add("php");

        set2.add("Java");
        set2.add("Python");
        set2.add("c++");
        set2.add("Javascript");
        set2.add("php");

        set3.add("Java");
        set3.add("Python");
        set3.add("c++");
        set3.add("Javascript");
        set3.add("php");

        /*
        System.out.println("****************Hashset**********************");
        for (String s : set1) {
            System.out.println(s);
        }
        System.out.println("****************LinkedHashset**********************");

        for (String s : set2) {
            System.out.println(s);
        }
        System.out.println("****************TreeSet**********************");

        for (String s : set2) {
            System.out.println(s);
        }
         */
        //System.out.println(set1.contains("php"));
        //System.out.println(set1.isEmpty());
        set1.remove("Java");

        Set<String> set4 = new HashSet<String>();
        Set<String> set5 = new HashSet<String>();

        set4.add("Java");
        set4.add("Python");
        set4.add("c++");
        set4.add("Javascript");
        set4.add("php");

        set5.add("Go");
        set5.add("Java");
        set5.add("CSS");

        Set<String> fark = new HashSet<String>(set5);

        System.out.println(fark.removeAll(set4));
        System.out.println(fark);
        
        Set<String> kesisim = new HashSet<String>(set5);
        
        System.out.println(kesisim.retainAll(set4));
        System.out.println(kesisim);

    }
}
