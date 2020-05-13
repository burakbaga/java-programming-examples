
import java.util.Scanner;

class SiyasiException extends Exception {

    @Override
    public void printStackTrace() {
        System.out.println("Siyasi yasağın bulunuyor.");
    }

}

class VizeException extends Exception {

    @Override
    public void printStackTrace() {
        System.out.println("Lütfen yurtdışı harcını tam yatırın.");
    }

}

class HarcException extends Exception {

    @Override
    public void printStackTrace() {
        System.out.println("Siyasi yasağın bulunuyor.");
    }

}

public class Yolcu {

    private int harc;
    private boolean siyasiYasak;
    private boolean vizeDurumu;

    public Yolcu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Yatırdığımız harç bedeli : ");

        this.harc = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Siyasi yasaınız bulunuyor mu=");

        String cevap = scanner.nextLine();

        if (cevap.equals("evet")) {
            this.siyasiYasak = true;
        } else {
            this.siyasiYasak = false;
        }

        System.out.println("Vizenin bulunuyor mu?");

        String cevap2 = scanner.nextLine();

        if (cevap2.equals("evet")) {
            this.vizeDurumu = true;
        } else {
            this.vizeDurumu = false;
        }

    }

    public void yurdisiHarciKontrol() throws HarcException {

        if (this.harc < 15) {
            throw new HarcException();

        } else {
            System.out.println("yurt dışı harcı tamam");
        }

    }

    public void siyasiYasakKontrol() throws SiyasiException {
        if (siyasiYasak == true) {
            throw new SiyasiException();
        } else {
            System.out.println("Yasak yok çıkabilirisin");
        }

    }

    public void vizeDurumuKontrol() throws VizeException {
        if (this.vizeDurumu == true) {
            System.out.println("Vize ilemleri tamam");

        } else {
            throw new VizeException();
        }
    }

}
