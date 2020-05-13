
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
        
        Scanner scan = new Scanner(System.in);
        
        int secim = scan.nextInt();
        
        switch(secim){
            case 1:
                System.out.println("1");
                break;
            case 2 :
                System.out.println("2.");
                break;
            
            default :
                System.out.println("Defa");
        }
        
        
    }
}
