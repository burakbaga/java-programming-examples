
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static String harfNotuHesapla(String isim, int vize1, int vize2, int finalNot) {
        String cikti = "";

        double toplamNot = (vize1 * 3 / 10.0) + (vize2 * 3 / 10.0) + (finalNot * 4 / 10.0);

        if (toplamNot >= 90) {
            cikti = isim + " bu dersten AA aldı";

        } else if (toplamNot >= 85) {
            cikti = isim + " bu dersten BB";
        } else if (toplamNot >= 50) {
            cikti = isim + " bu dersten CC aldı";
        } else {
            cikti = isim + " bu dersten FF aldı";
        }
        return cikti;

    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(new FileReader("dosya.txt")); FileWriter writer = new FileWriter("harfnotlari.txt")) {

            while (scanner.hasNextLine()) {

                String ogrenciBilgileri = scanner.nextLine();

                String[] ogrenciArr = ogrenciBilgileri.split(",");

                int vize1 = Integer.valueOf(ogrenciArr[1]);
                int vize2 = Integer.valueOf(ogrenciArr[2]);
                int finalNotu = Integer.valueOf(ogrenciArr[3]);

                String cikti = harfNotuHesapla(ogrenciArr[0], vize1, vize2, finalNotu);

                
                writer.write(cikti+"\n");
                
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
