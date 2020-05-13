
public class Main {

    public static void ucuncuFonksiyon() {

        int a = 12 / 0;

    }

    public static void ikinciFonksiyon() {
        ucuncuFonksiyon();
    }

    public static void birinciFonksiyon() {
        try {
            ikinciFonksiyon();

        } catch (ArithmeticException e) {
            System.out.println("Hata oluştu.");
        }
    }

    public static void main(String[] args) {
        birinciFonksiyon();
        System.out.println("Burası çalışır.");
    }

}
