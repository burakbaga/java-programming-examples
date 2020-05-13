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
        
        Kare kare1 = new Kare("kare1",10);
        
        Daire daire1 = new Daire("daire1",3);
        
        Sekil kare2 = new Kare("kare2",15);
        Sekil daire2 = new Daire("daire2",2);
        
        kare2.alan_hesapla();
        daire2.alan_hesapla();
        
        
        kare1.cevreHesapla();
        
        //kare2.cevreHesapla() yapamayız çünkü şekilden türetildi...
         
    }
}
