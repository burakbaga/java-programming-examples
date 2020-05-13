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

        StaticClass s1 = new StaticClass("burak");
        StaticClass s2 = new StaticClass("baga");

        System.out.println(StaticClass.objeSayisi);

        toplama(3, 4, 5);

    }

    public static void toplama(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}
