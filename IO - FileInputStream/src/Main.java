
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

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

        FileInputStream fis = null;

        try {
            fis = new FileInputStream("dosya.txt");

            int deger;

            String s = "";

            while ((deger = fis.read()) != -1) {
                s += (char) deger;
            }
 
            System.out.println("Dosya içeriği : " + s);

        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı.");
        } catch (IOException ex) {
            System.out.println("Dosya");
        } finally {
            try {

                if (fis != null) {
                    fis.close();

                }
            } catch (IOException ex) {
                System.out.println("Dosya kapanamadı.");
            }
        }
    }

}
