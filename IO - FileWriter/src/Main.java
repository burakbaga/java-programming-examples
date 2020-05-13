
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {
        
        FileWriter writer = null;
        
        try {
            writer = new FileWriter("dosya.txt");
            writer.write("Burak Bagataran \n");
            writer.write("Hasan ali \n");
        } catch (IOException ex) {
            System.out.println("Dosya açılırken ıo exception oluştu.");
        }finally{
            if(writer!=null){
                try {
                    writer.close();
                } catch (IOException ex) {
                    System.out.println("Kapanırken hata oldu.");
                }
            }
        }
        
        
    }
}
