public class StringDemo11 {
    public static void main(String[] args) {
        // 定义一个字符串记录身份证号码
        String id = "112645897512345975";

        String year = id.substring(6, 10);
        String month = id.substring(10, 12);
        String day = id.substring(12, 14);

        char gender = id.charAt(16);
        int num = ((int) gender) - 48;
        if (num % 2 == 0) {
            System.out.println("Female");
        } else {
            System.out.println("Male");
        }
    }
}
