
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
public class ATM {

    public void calis(Hesap hesap) {
        Login login = new Login();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hoşgeldiniz..");

        System.out.println("***************************");

        System.out.println("Kullanıcı Girişi");

        int giris_hakki = 3;

        while (true) {
            if (login.login(hesap)) {

                System.out.println("Giriş başarılı");
                break;

            } else {
                System.out.println("Giriş başarısız");
                giris_hakki--;
                System.out.println("Kalan giris hakkı" + giris_hakki);
            }
            if (giris_hakki == 0) {
                System.out.println("Giriş hakkınız bitti");
                return;
            }
        }

        System.out.println("****************************");

        String islemler = "1.Bakiye Görüntüle \n"
                + "2.para yatırma \n" + "3.para çekme \n" + "Çıkış için q ya basın \n";

        System.out.println(islemler);

        while (true) {
            System.out.println("İşlemi seçin..");
            String islem = scanner.nextLine();

            if (islem.equals("q")) {
                break;

            }else if(islem.equals("1")) {
                System.out.println(hesap.getBakiye());
                
            }else if (islem.equals("2")){
                System.out.println("Ne kadar yatırmak istiyorsunuz");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                
                hesap.paraYatir(tutar);
                
                
            }else if (islem.equals("3")){
                System.out.println("Ne kadar çekmek istiyorsunuz?");
                int tutar =scanner.nextInt();
                hesap.paraCek(tutar);
            }

        }

    }

}
