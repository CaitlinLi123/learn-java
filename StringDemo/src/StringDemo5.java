import java.util.Scanner;

public class StringDemo5 {
    public static void main(String[] args) {
        // traverse a string
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give a string.");
        String str = sc.next();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}
