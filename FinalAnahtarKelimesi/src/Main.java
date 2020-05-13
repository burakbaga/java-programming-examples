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

        FinalTest f1 = new FinalTest("Burak");
        FinalTest f2 = new FinalTest("baga");

        System.out.println(f1.objeSayisi);
        System.out.println(f2.objeSayisi);

        // Math.PI = 5; // final olarak tanımlandığı için değiştiremeyiz..
        System.out.println(Database.databaseIsmi);
        System.out.println(Database.userName);
        System.out.println(Database.password);
    }

}
