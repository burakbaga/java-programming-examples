
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
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
public class ObjeyiYaz {
    
    public static void main(String[] args) {
        
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("ogrenci.bin"))) {
            
            Ogrenci ogrenci1 = new Ogrenci("Burak Bagatarhan", 123, "Bilgisayar");
            Ogrenci ogrenci2 = new Ogrenci("Nehir Bagatarhan", 456, "Pilot");
            
            Ogrenci.setOgrenci_sayisi(100); // statik alana değer verildi.
            out.writeObject(ogrenci1);
            out.writeObject(ogrenci2);
            
        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı");
        } catch (IOException ex) {
            System.out.println("IO exception");
            
        }
        
    }
}
