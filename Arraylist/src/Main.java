
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bagat
 */
public class Main {

    public static void yazdir(ArrayList<String> arr) {

        for (String i : arr) {
            System.out.println(i);
        }

    }

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        arrayList.add("Metallica");
        arrayList.add("Guns n roses");
        arrayList.add("black");
        arrayList.add("Iron maiden");
        arrayList.add("Metallica");

        arrayList.set(4, "Megadeth");

        //System.out.println(arrayList.get(2));
        // System.out.println(arrayList.size());
        // arrayList.remove("Metallica");
        System.out.println(arrayList.indexOf("Metallica"));
        //System.out.println(arrayList.lastIndexOf("Metallica"));
/*
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        
         */

        yazdir(arrayList);

    }
}
