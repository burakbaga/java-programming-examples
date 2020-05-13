
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    
    public static void main(String[] args) {
        /*
        try (Scanner scanner = new Scanner(new FileReader("ogrenciler.txt"))) {
            while (scanner.hasNextLine()) {
                String ogrenci = scanner.nextLine();

                String[] arr = ogrenci.split(",");

                if (arr[1].equals("Bilgisayar Mühendisliği")) {
                    System.out.println(ogrenci);
                }

            }

        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı.");
        } catch (IOException ex) {
            System.out.println("ıo hatası oldu.");
        }*/

///////BUFFERED READER
/*
   try (Scanner scanner = new Scanner(new BufferedReader(new FileReader("ogrenciler.txt")))) {
            while (scanner.hasNextLine()) {
                String ogrenci = scanner.nextLine();

                String[] arr = ogrenci.split(",");

                if (arr[1].equals("Bilgisayar Mühendisliği")) {
                    System.out.println(ogrenci);
                }

            }

        } catch (FileNotFoundException ex) {
            System.out.println("Dosya bulunamadı.");
        } catch (IOException ex) {
            System.out.println("ıo hatası oldu.");
        }
         */
/////BUFFERED WRITER
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("ogrenciler.txt", true))) {
            writer.write("Hasan ali,makine");
        } catch (IOException ex) {
            System.out.println("Dosya açılırken hata oldu");
        }
        
    }
    
}
