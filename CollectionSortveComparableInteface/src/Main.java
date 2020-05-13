
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author bagat
 */
class Player implements Comparable<Player> {
 
    private String isim;
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public String toString() {

        return "ID: " + id + " isim :" + isim;

    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.isim);
        hash = 83 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (this.id != other.id) {
            return false;
        }
        if (!Objects.equals(this.isim, other.isim)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Player player) {
        if (this.id < player.id) {
            return -1;
        } else if (this.id > player.id) {
            return 1;

        } else {
            return 0;
        }

    }

}

public class Main {

    public static void main(String[] args) {

        List<Player> list_player = new ArrayList<Player>();

        list_player.add(new Player("Murat", 5));
        list_player.add(new Player("Emre", 1));
        list_player.add(new Player("Oğuz", 10));
        list_player.add(new Player("Yusuf", 4));

        Collections.sort(list_player);

        for (Player p : list_player) {
            System.out.println(p.toString());
        }

        Set<Player> treeset = new TreeSet<Player>();

        treeset.add(new Player("Murat", 5));
        treeset.add(new Player("Emre", 1));
        treeset.add(new Player("Oğuz", 10));
        treeset.add(new Player("Yusuf", 4));
        
        
        for (Player p : treeset) {
            System.out.println(p.toString());
        }

        /*

        Player p1 = new Player("sadsad", 6);
        Player p2 = new Player("ffdsf", 1);

        System.out.println(p1.compareTo(p2));// 1 değerini döndürür...... 
         */

 /*
        List<String> list_string = new ArrayList<String>();

        list_string.add("Java");
        list_string.add("C++");
        list_string.add("Python");
        list_string.add("Php");
        list_string.add("Go");

        Collections.sort(list_string);

        for (String s : list_string) {
            System.out.println(s);
        }

         */
    }
}
