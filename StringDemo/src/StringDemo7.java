public class StringDemo7 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };
        System.out.println(arrayToString(arr));
    }

    public static String arrayToString(int[] arr) {
        if (arr == null) {
            return "";
        }
        String res = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                res += arr[i] + ", ";
            } else {
                res += arr[i] + "]";
            }
        }
        return res;
    }
}
