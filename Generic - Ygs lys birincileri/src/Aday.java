/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bagat
 */
public abstract class Aday {

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    private String isim;
    private int turkce;
    private int mat;
    private int edebiyat;
    private int fizik;

    public Aday(int turkce, int mat, int edebiyat, int fizik, String isim) {
        this.turkce = turkce;
        this.mat = mat;
        this.edebiyat = edebiyat;
        this.fizik = fizik;
        this.isim = isim;
    }

    abstract int puanHesapla();

    public int getTurkce() {
        return turkce;
    }

    public void setTurkce(int turkce) {
        this.turkce = turkce;
    }

    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public int getEdebiyat() {
        return edebiyat;
    }

    public void setEdebiyat(int edebiyat) {
        this.edebiyat = edebiyat;
    }

    public int getFizik() {
        return fizik;
    }

    public void setFizik(int fizik) {
        this.fizik = fizik;
    }

}
