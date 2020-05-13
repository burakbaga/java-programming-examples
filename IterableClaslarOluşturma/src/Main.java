
import java.util.Iterator;

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
        
        String[] kanallar = {"Radyo viva","Radyo fenomen","Kral Pop","Alem fm","Gala"};
        
        
        Radyo radyo = new Radyo(kanallar);
        
        for(String s : radyo){
            System.out.println(s);
        }
        
        Iterator<String> iterator = radyo.iterator();
        
        while(iterator.hasNext())
        {
            System.out.println(iterator.next());
        }            
        
    }
}
