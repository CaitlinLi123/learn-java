public class StringDemo8 {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(reverse(str));
    }

    public static String reverse(String str) {
        String res = "";
        for (int i = str.length() - 1; i > -1; i--) {
            res += str.charAt(i);
        }
        return res;
    }
}
