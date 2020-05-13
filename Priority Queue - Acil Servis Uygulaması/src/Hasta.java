
public class Hasta implements Comparable<Hasta> {

    private String isim;
    private String sikayet;
    private int oncelik;

    public Hasta(String isim, String sikayet) {
        this.isim = isim;
        this.sikayet = sikayet;

        if (sikayet.equals("Apandisit")) {
            this.oncelik = 3;

        } else if (sikayet.equals("Yanık")) {
            this.oncelik = 2;
        } else if (sikayet.equals("Bas")){
            this.oncelik = 1;
        }

    }

    @Override
    public int compareTo(Hasta o) {
        if (this.oncelik < o.oncelik) {
            return 1;
        } else if (this.oncelik > o.oncelik) {
            return -1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Hasta{" + "isim=" + isim + ", sikayet=" + sikayet + ", oncelik=" + oncelik + '}';
    }

}
