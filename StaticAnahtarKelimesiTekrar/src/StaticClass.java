/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bagat
 */
public class StaticClass {

    public static int objeSayisi;
    private String isim;

    public StaticClass(String isim) {
        objeSayisi++;
        this.isim = isim;
    }

    public String getIsim() {
        return this.isim;
    }

}
