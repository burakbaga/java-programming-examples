
import java.util.Scanner;

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

        Matematik.Factorial fakt = new Matematik().new Factorial();
        Matematik.Asal asal = new Matematik().new Asal();
        Matematik.Alan.DaireAlan alan = new Matematik().new Alan().new DaireAlan();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayi gir");

        int sayi = scanner.nextInt();

        if (asal.asalmi(sayi)) {
            System.out.println("Bu sayi asal");
        } else {
            System.out.println("Bu sayı asal değil");
        }

        fakt.faktoriyel();

        alan.daire_alan(5);
    }

}
