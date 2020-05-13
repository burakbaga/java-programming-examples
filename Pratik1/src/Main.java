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

        String[] dizi = {"abcd", "bcda", "cba", "cba", "afz"};

        for (String str : dizi) {
            char[] arr = str.toCharArray();
            int len = str.length();
            int say = 1;
            for (int i = 0; i < len - 1; i++) {

                if (arr[i] < arr[i + 1]) {
                    say++;

                }

                if (say == len) {
                    System.out.println(str);
                }

            }

        }

    }
}
