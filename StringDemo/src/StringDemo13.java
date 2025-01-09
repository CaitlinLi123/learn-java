import java.util.Scanner;
import java.util.StringJoiner;

public class StringDemo13 {
    // switch to roman numbers
    public static void main(String[] args) {
        // I-1 II-2 III-3 IV-4 V-5 VI-6 VII-7 VIII-8 IX-9
        Scanner sc = new Scanner(System.in);
        String str;
        while (true) {
            System.out.println("Give me a number");
            str = sc.next();
            boolean flag = checkStr(str);
            if (flag) {
                break;
            } else {
                System.out.println("You give an invalid number! Please try again");
                continue;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int num = c - 48;
            sb.append(changeToRoman(num));
        }

        System.out.println(sb.toString());

    }

    public static String changeToRoman(int number) {
        String[] arr = { "", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX" };
        return arr[number];
    }

    public static boolean checkStr(String str) {
        // length < 9
        if (str.length() > 9) {
            return false;
        }

        // only numbers
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c < '0' || c > '9') {
                return false;
            }
        }
        return true;
    }
}
