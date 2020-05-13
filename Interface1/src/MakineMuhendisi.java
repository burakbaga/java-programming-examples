/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bagat
 */
public class MakineMuhendisi implements IMuhendis,ICalisma {

    private boolean askerlik;
    private boolean adli_sicil;

    public MakineMuhendisi(boolean askerlik, boolean adli_sicil) {
        this.askerlik = askerlik;
        this.adli_sicil = adli_sicil;
    }

    @Override
    public void askerlik_durumu_sorgula() {
        if (askerlik) {
            System.out.println("Askerliğimi yaptım.");
        } else {
            System.out.println("Askerliğimi henüz yapmadım.");
        }
    }

    @Override
    public String mezuniyet_ortalamasi(double derece) {
        return "Ortalamam : " + derece;
    }

    @Override
    public void adli_sicil_sorgula() {
        if (adli_sicil) {
            System.out.println("Adli sicil kaydım bulunuyor.");
        } else {
            System.out.println("Adli sicil kaydım bulunmuyor.");
        }

    }

    @Override
    public void is_tecrubesi(String[] array) {
        if (array.length == 0) {
            System.out.println("İş tecrubem yok");
        } else {
            System.out.println("şnlarda çalıştım");

            for (String i : array) {
                System.out.println(i);
            }
        }
    }
    
    public void referans_getir(String [] array){
         if (array.length == 0) {
            System.out.println("Herhangi bir referans yok");
        } else {
            System.out.println("Referanslarım");

            for (String i : array) {
                System.out.println(i);
            }
        }
    }

    @Override
    public void calis() {
        System.out.println("Makine Mühendisi çalışıyor....");
    }

}
