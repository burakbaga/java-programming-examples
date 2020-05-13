
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Player {

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
    
    
    

}

public class Main {

    public static void main(String[] args) {

        Set<Player> hashset = new HashSet<Player>();

        Player player1 = new Player("burak", 1);
        Player player2 = new Player("mustafa", 2);
        Player player3 = new Player("hasan", 6);
        Player player4 = new Player("burak", 1);

        hashset.add(player1);
        hashset.add(player2);
        hashset.add(player3);
        hashset.add(player4);
        
        for(Player p : hashset){
            System.out.println(p.toString());
        }
        

    }

}
