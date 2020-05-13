
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Character[] char_dizi = {'J', 'A', 'V', 'A'};
        Integer[] int_dizi = {1, 2, 3, 4, 5, 6};
        String[] string_dizi = {"Java", "python", "c++", "php"};

        Ogrenci[] ogrenci_dizi = {new Ogrenci("Burak"), new Ogrenci("Mustafa"), new Ogrenci("Merve")};
        /*
        CharYazdir.yazdir(char_dizi);
        System.out.println("*******************************");
        StirngYazdir.yazdir(string_dizi);
        System.out.println("*******************************");

        IntYazdir.yazdir(int_dizi);
        System.out.println("*******************************");

        OgrenciYazdir.yazdir(ogrenci_dizi);*/

        YazdirmaSinifi<Character> yazdirChar = new YazdirmaSinifi<Character>();
        YazdirmaSinifi<String> yazdirString = new YazdirmaSinifi<String>();
        YazdirmaSinifi<Integer> yazdirInt = new YazdirmaSinifi<Integer>();
        YazdirmaSinifi<Ogrenci> yazdirOgrenvi = new YazdirmaSinifi<Ogrenci>();

        yazdirChar.yazdir(char_dizi);

        yazdirInt.yazdir(int_dizi);
    }

}
