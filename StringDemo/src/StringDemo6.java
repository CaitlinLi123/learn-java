import java.util.Scanner;

public class StringDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please give a string");
        String str = sc.next();
        int bigCount = 0;
        int smallCount = 0;
        int numCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                // char类型的变量再参与计算的时候自动类型提升为int
                smallCount++;
            } else if (c >= 'A' && c <= 'Z') {
                bigCount++;
            } else if (c >= '0' && c <= '9') {
                numCount++;
            }
        }
        System.out.println("bigCount: " + bigCount);
        System.out.println("smallCount: " + smallCount);
        System.out.println("numCount: " + numCount);
    }
}
