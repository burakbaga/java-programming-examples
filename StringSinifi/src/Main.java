
public class Main {

    public static void main(String[] args) {

        String a1 = "Burak";
        String a2 = "Burak";
        
        
        String b1 = "Burak";
        String b2 = new String ("Burak");
        
        
        if (b1.equals(b2)){ // içerikleri karşılaştırılır
            System.out.println("Eşitler");
        }

        if(a1==a2){ // referenslar karşılaştırılrır 
            System.out.println("Eşitler");
        }
        
        
        /*
        System.out.println(a.length());

        System.out.println("0. index " + a.charAt(2)); // indexte eleman yazdırman

        System.out.println("Son eleman: " + a.charAt(a.length() - 1)); // son eleman yazdırma 

        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));
        }

        System.out.println(a.startsWith("Mu"));

        System.out.println(a.indexOf("u"));

        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        
        
        String yil = "1923";
        
        int iyil = Integer.parseInt(yil);
        
        int b1 = 1923;
        
        String b2 = String.valueOf(b1);
        
        
         */
    }

}
