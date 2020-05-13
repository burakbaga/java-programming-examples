
import java.util.Enumeration;
import java.util.Stack;

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

    public static void main(String[] args) {
        /*
        
        Vector<String> vektor = new Vector<String>();

        vektor.add("Java");
        vektor.add("Python");
        vektor.add("Python");
        vektor.add("Php");
         */
 /*
        for (String s : vektor) {
            System.out.println(s);
        }

        ListIterator<String> iterator = vektor.listIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        Enumeration<String> enumaration = vektor.elements();

        while (enumaration.hasMoreElements()) {
            System.out.println(enumaration.nextElement());
        }*/
 /*
        System.out.println("İlk eleman: "+vektor.firstElement());
        System.out.println("Son eleman:"+vektor.lastElement());
         */

//////////////////////////////////STACK////////////////////////////
        Stack<String> stack = new Stack<String>();

        stack.push("Java");
        stack.push("python");
        stack.push("php");
        stack.push("go");

        System.out.println("Son eleman çıkarılıyor "+ stack.pop());

        Enumeration<String> enumeration = stack.elements();

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }

        
        //System.out.println(stack.peek()); // son elemana bakmak 
        
        while(!stack.empty()){
            System.out.println("Elaman çıkarılıyor "+stack.pop());
        }
        
    }

}
