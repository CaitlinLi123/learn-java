public class StringDemo10 {
    // 手机号屏蔽
    public static void main(String[] args) {
        String phoneNumber = "13112378945";
        String start = phoneNumber.substring(0, 3);
        String end = phoneNumber.substring(7);
        String result = start + "****" + end;
        System.out.println(result);
    }

}
