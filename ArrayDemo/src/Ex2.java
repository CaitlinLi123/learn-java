public class Ex2 {
    // Defind an array
    // for odd elements, multiple it by 2
    // for even elements, shrink it to half
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] = arr[i] * 2;
            } else {
                arr[i] = arr[i] / 2;
            }
            System.out.println(arr[i]);
        }
    }
}