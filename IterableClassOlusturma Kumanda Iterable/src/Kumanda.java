
import java.util.ArrayList;
import java.util.Iterator;

public class Kumanda implements Iterable<String> {

    ArrayList<String> kanallar = new ArrayList<String>();

    public class KumandaIterator implements Iterator<String> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            if (index < kanallar.size()) {
                return true;
            }
            return false;
        }

        @Override
        public String next() {
            String kanal = kanallar.get(index);
            index++;
            return kanal;

        }

    }

    public void kanalEkle(String kanal) {
        kanallar.add(kanal);
    }

    public void kanalSil(String kanal) {
        kanallar.remove(kanal);
    }

    public int kanalSayisi() {
        return kanallar.size();
    }

    @Override
    public Iterator<String> iterator() {

        return new KumandaIterator();
    }

}
