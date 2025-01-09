import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        // correct username and password
        String rightUsername = "yu";
        String rightPwd = "123456";

        int count = 0;
        Scanner sc = new Scanner(System.in);
        while (count < 3) {
            System.out.println("Username:");
            String username = sc.next();
            System.out.println("Password:");
            String pwd = sc.next();

            // compare
            if (username.equals(rightUsername) && pwd.equals(rightPwd)) {
                System.out.println("success!");
            } else {
                if (count < 2) {
                    System.out.println("Wrong username or password. You still have " + (3 - count - 1) + " chances.");
                } else {
                    System.out.println("Your account is locked.");
                }

            }
            count++;
        }
        sc.close();
    }
}
