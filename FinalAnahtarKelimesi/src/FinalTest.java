
public class FinalTest {

    public final int objeSayisi;

    private static int say;

    private final String isim;

    public FinalTest(String isim) {
        this.isim = isim;
        say++;
        objeSayisi = say;

    }

    public static int getSay() {
        return say;
    }

    public static void setSay(int say) {
        FinalTest.say = say;
    }
    

}
