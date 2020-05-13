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
        
        ATM atm = new ATM();
        Hesap hesap = new Hesap("Burak","1234",2000);
        
        
        atm.calis(hesap);
        System.out.println("Programdan çıkılıyor...");
    }
    
}
