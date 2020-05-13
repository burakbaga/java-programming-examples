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

        /*int a = 30/0; // Unchecked exception runtime anında hata verir... (Arithmetic Exception)
        System.out.println("Burası çalışamaz.."); */
        try {
            int a = 30 / 0;
            int[] b = {1, 2, 3, 4, 5};

            System.out.println(b[5]);

        } catch (ArithmeticException e) {
            System.out.println("Bir sayı sıfıra bölünmez.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array boyutu aşıldı");
        } catch (Exception e) {
            System.out.println("Hata oluştu.");
        }

        System.out.println("Burası çalışıyor.");
    }

}
