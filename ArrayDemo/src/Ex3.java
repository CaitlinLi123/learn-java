public class Ex3 {
    // get the minimal or maximal of an array
    public static void main(String[] args) {
        int[] arr = { 33, 5, 22, 44 };
        System.out.println(getMax(arr));
        System.out.println(getMin(arr));
    }

    // maximal
    public static int getMax(int[] arr) {
        int maxVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (maxVal < arr[i]) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    // minimal
    public static int getMin(int[] arr) {
        int minVal = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minVal > arr[i]) {
                minVal = arr[i];
            }
        }
        return minVal;
    }
}
