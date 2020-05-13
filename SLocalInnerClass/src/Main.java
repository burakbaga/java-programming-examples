
public class Main {

    public static void main(String[] args) {

        class Alan {

            public void daireAlan(int yaricap) {
                System.out.println("Daire alanı : " + (yaricap * yaricap * Math.PI));
            }
        }

        Alan alan = new Alan();

        alan.daireAlan(5);

    }

    public static void deneme(){
       // Alan alan = new Alan(); // kullanamayızzzzz.
    }
}
