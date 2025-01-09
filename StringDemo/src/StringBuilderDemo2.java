import java.util.Scanner;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        // check if a string is palindrome
        Scanner sc = new Scanner(System.in);
        System.out.println("Give me a string.");
        String str = sc.next();

        StringBuilder sb = new StringBuilder();
        String res = sb.append(str).reverse().toString();
        System.out.println(res.equals(str));

    }
}
