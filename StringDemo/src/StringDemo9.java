import java.util.Scanner;

public class StringDemo9 {
    public static void main(String[] args) {
        // 1. 键盘录入金额
        Scanner sc = new Scanner(System.in);
        int money;
        while (true) {
            System.out.println("Please give the amount.");
            money = sc.nextInt();
            if (money >= 0 && money <= 99999999) {
                break;
            } else {
                System.out.println("Invalid money");
            }
        }

        // 2. 得到money中的每一个数字
        String moneyStr = "";
        while (true) {
            // 从右往左
            int mod = money % 10;
            moneyStr = getCapitalNumber(mod) + moneyStr;
            money = money / 10;
            if (money == 0) {
                break;
            }
        }
        System.out.println(moneyStr);

        // 3.补齐7位
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }

        // 4.插入单位
        String res = "";
        String[] arr = { "佰", "拾", "万", "仟", "佰", "拾", "元" };
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            res += c + arr[i];
        }
        System.out.println(res);
    }

    public static String getCapitalNumber(int number) {
        String[] arr = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖" };
        return arr[number];
    }
}
