
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Baglanti {

    private String kullaniciAdi = "root";
    private String parola = "";

    private String dbName = "demo";
    private String host = "localhost";
    private int port = 3306;

    private Connection conn = null;

    private Statement stat = null;

    private PreparedStatement preStat = null;

    public void preparedCalisanlariGetir(int id) {
        String sorgu = "Select * From calisanlar where id > ?";
        try {
            preStat = conn.prepareStatement(sorgu);

            preStat.setInt(1, id);

            ResultSet rs = preStat.executeQuery();

            while (rs.next()) {
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");

                System.out.println("ID: " + id + " Ad: " + ad + " Soyad : " + soyad + " Email :" + email);
            }

        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*try { 
                    stat = conn.createStatement();
                    String sorgu = "Select * from calisanlar where ad like 'M%'";
                    
                    ResultSet rs = stat.executeQuery(sorgu);
                    
                    while(rs.next()){
                    System.out.println(rs.getString("ad"));
                    }
                    } catch (SQLException ex) {
                    Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    
                    
         */
    }

    public void commitandRollback() {

        try {
            conn.setAutoCommit(false);
            String sorgu1 = "Delete from calisanlar where id=3";
            String sorgu2 = "Update calisanlar set email = 'exam@gmail.com' where id = 1 ";

            System.out.println("Güncellemeden önce");

            calisanlariGetir();

            stat = conn.createStatement();
            stat.executeUpdate(sorgu1);
            stat.executeUpdate(sorgu2);

            System.out.println("İşlemler kaydedilsin mi (yes or no)");
            Scanner scanner = new Scanner(System.in);
            String cevap = scanner.nextLine();

            if (cevap.equals("yes")) {
                conn.commit();
                calisanlariGetir();
                System.out.println("Veri tabanı güncellendi.");
            } else {
                conn.rollback();
                System.out.println("Veritabanı güncellemesi iptal edildi.");
            }

        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void calisanGuncelle() {
        String sorgu = "Update calisanlar Set email='kubra@gmail.com' where id=1";

        try {
            stat = conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            stat.executeUpdate(sorgu);
            /*
            String ad = "Kübra";
            String soyad = "Mercan";
            String email = "kubra@gmail.com";
             */
        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void calisanSil() {
        String sorgu = "Delete from calisanlar where id>6";

        try {
            stat = conn.createStatement();

            int deger = stat.executeUpdate(sorgu);

            System.out.println(deger + " kadar veri etkilendi.");

        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void calisanEkle() {
        try {
            stat = conn.createStatement();
            String ad = "Semih";
            String soyad = "Aktaş";
            String email = "semih@gmail.com";
            String sorgu = "Insert Into calisanlar (ad,soyad,email) VALUES (" + "'" + ad + "'," + "'" + soyad + "'," + "'" + email + "')";
            stat.executeUpdate(sorgu);

        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void calisanlariGetir() {
        String sorgu = "Select * from calisanlar";

        try {
            stat = conn.createStatement();
            ResultSet rs = stat.executeQuery(sorgu);

            while (rs.next()) {

                int id = rs.getInt("id");
                String ad = rs.getString("ad");
                String soyad = rs.getString("soyad");
                String email = rs.getString("email");

                System.out.println("ID: " + id + " Ad: " + ad + " Soyad : " + soyad + " Email :" + email);

            }

        } catch (SQLException ex) {
            Logger.getLogger(Baglanti.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private Baglanti() {
        String url = "jdbc:mysql://" + host + ":" + port + "/" + dbName + "?useUnicode=true&characterEncoding=utf8";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver bulunamadı.");

        }

        try {
            conn = DriverManager.getConnection(url, kullaniciAdi, parola);
            System.out.println("Bağlantı Başarılı.");
        } catch (SQLException ex) {
            System.out.println("Bağlantı başarısız.");
        }

    }

    public static void main(String[] args) {

        Baglanti baglanti = new Baglanti();

        baglanti.commitandRollback();

        /* 
        baglanti.preparedCalisanlariGetir(3);
        baglanti.calisanEkle();
        baglanti.calisanSil();
        baglanti.calisanGuncelle();
             baglanti.calisanlariGetir();
         */
    }

}
