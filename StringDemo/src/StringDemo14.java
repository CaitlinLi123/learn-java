public class StringDemo14 {
    public static void main(String[] args) {
        String strA = "abcde";
        String strB = "bcdea";
        boolean res = check(strA, strB);
        System.out.println(res);
    }

    public static boolean check(String strA, String strB) {
        for (int i = 0; i < strA.length(); i++) {
            strA = rotate(strA);
            if (strA.equals(strB)) {
                return true;
            }
        }
        return false;
    }

    public static String rotate(String str) {
        // the left characters will be put to right
        char first = str.charAt(0);
        String end = str.substring(1);

        return end + first;
    }
}
