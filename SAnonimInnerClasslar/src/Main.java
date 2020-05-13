
public class Main {

    public static void main(String[] args) {
        IOgrenci ogrenci = new IOgrenci() {
            @Override
            public void ders_calis() {
                System.out.println("Ders Calisiyorumm");
            }

            @Override
            public void derse_gir() {
                System.out.println("Derse giriyorum");
            }
        };
        
        AOgrenci ogrenci2 = new AOgrenci("burak",15){
            @Override
            void kayit_yaptir() {
                System.out.println("Kayıt yapıldı."+getIsim());
            }
            
        };
        
        ogrenci2.kayit_yaptir();
        ogrenci2.selamla();
        
        
        
        ogrenci.ders_calis();
        ogrenci.derse_gir();
        
    }

    public interface IOgrenci {

        void ders_calis();

        void derse_gir();

    }
    
    public static abstract class AOgrenci{
        
        private String isim ;
        private int numara;

        public AOgrenci(String isim, int numara) {
            this.isim = isim;
            this.numara = numara;
        }

        public String getIsim() {
            return isim;
        }

        public void setIsim(String isim) {
            this.isim = isim;
        }

        public int getNumara() {
            return numara;
        }

        public void setNumara(int numara) {
            this.numara = numara;
        }
        
        
        abstract void kayit_yaptir();
        
        public void selamla()
        {
            System.out.println("Selam");
        }
        
    }

}
