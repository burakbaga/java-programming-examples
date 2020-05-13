
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static boolean pal(String cumle, Stack<Character> stack) {

        for (int i = cumle.length() / 2 + 1; i < cumle.length(); i++) {
            if (cumle.charAt(i) != stack.pop()) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String cumle = scanner.nextLine();
        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < cumle.length() / 2; i++) {
            stack.push(cumle.charAt(i));

        }

        if (pal(cumle, stack)) {
            System.out.println("Palindrom");
        }else System.out.println("Pal değil");
    }
}