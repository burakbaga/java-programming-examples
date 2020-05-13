/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bagat
 */
public class EsitAgirlik extends Aday {

    public EsitAgirlik(int turkce, int mat, int edebiyat, int fizik) {
        super(turkce, mat, edebiyat, fizik);
    }

    @Override
    int puanHesapla() {
        return getTurkce() * 5 + getMat() * 5 + getFizik() * 1 + getEdebiyat() * 4;

    }

}
