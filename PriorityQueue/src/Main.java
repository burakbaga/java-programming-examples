
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;

class Player implements Comparable<Player> {

    private String isim;
    private int id;

    public Player(String isim, int id) {
        this.isim = isim;
        this.id = id;
    }

    @Override
    public int compareTo(Player o) {

        if (this.id < o.id) {
            return -1;
        } else if (this.id > o.id) {
            return 1;
        } else {
            return 0;
        }

    }

    @Override
    public String toString() {
        return "İsim  "+isim+"  id  " +id; //To change body of generated methods, choose Tools | Templates.
    }
}

public class Main {

    public static void main(String[] args) {

        Queue<Integer> priority = new PriorityQueue<Integer>();

        priority.offer(5);
        priority.offer(1);
        priority.offer(2);
        priority.offer(3);
        priority.offer(4);
        priority.offer(9);

        Player p1 = new Player("Burak", 2);
        Player p2 = new Player("mehmet", 3);
        Player p3 = new Player("berk", 9);
        Player p4 = new Player("ali", 0);
        Player p5 = new Player("hasan", 7);

        Queue<Player> player_queue = new PriorityQueue<Player>();
        player_queue.offer(p1);
        player_queue.offer(p2);
        player_queue.offer(p3);
        player_queue.offer(p4);
        player_queue.offer(p5);

        while(!player_queue.isEmpty()){
            System.out.println(player_queue.poll());
        }


        /*
        for (int i : priority) {
            System.out.println(i);
        }
         */
        //System.out.println(priority.peek()); // ilk eleman 1 
        /*
        
        
        System.out.println(priority.contains(10));

        while (!priority.isEmpty()) {

            System.out.println(priority.poll());

        }
         */
    }

}
