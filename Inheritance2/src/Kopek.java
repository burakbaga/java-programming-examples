/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bagat
 */
public class Kopek extends Hayvan {

    private int dis_sayisi;

    public int getDis_sayisi() {
        return dis_sayisi;
    }

    public void setDis_sayisi(int dis_sayisi) {
        this.dis_sayisi = dis_sayisi;
    }

    public Kopek(String isim, int kilo, int boy, int bacak_sayisi, int dis_sayisi) {
        super(isim, kilo, boy, bacak_sayisi);
        this.dis_sayisi = dis_sayisi;
    }

    public void hareketeGec(int hiz) {
        System.out.println("Kopek " + hiz + " kosuyor..");

    }

    public void kos(int hiz) {
        System.out.println("Kopek kosuyor. ");
        //super.hareketeGec(hiz); //override ettiğimizde kendi içerisinde olan method çalışır ... 
        hareketeGec(hiz);

    }
}
