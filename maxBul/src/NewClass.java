
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
public class NewClass {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b= scan.nextInt();
        int c = scan.nextInt();
        int max;
        if ( a>=b& a>=c ){
            max = a;
        }
        else if (b>=a & b>=c){
            max = b;
        }else {
            max = c;
        }
        
        System.out.println(max);
        

    }
}
