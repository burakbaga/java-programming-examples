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
        try{
            String s = null;
            System.out.println(s.hashCode());
        }catch(NullPointerException e ){
            System.out.println("Null referans hatası.");
        }finally{
            System.out.println("Burası kesin çalışır.");
        }
        
        
    }
}
