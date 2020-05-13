/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bagat
 */
public class Test {

    public static void main(String[] args) {

        Account hesap1 = new Account();
        Account hesap2 = new Account("123456", 1000.0, "Burak", "bagata@gmail.com", "5354704321");
        Account hesap3 = new Account("ahmet","example","52132352");
        hesap3.bilgileriGoster();
        hesap1.bilgileriGoster();
        hesap2.bilgileriGoster();

    }

}
