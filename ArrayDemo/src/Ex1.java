public class Ex1 {
    // traverse the array and get the sum value
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        printSum(arr);
        printMultipleOfThree(arr);
    }

    public static void printSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }

    public static void printMultipleOfThree(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                System.out.println(arr[i]);
                count++;
            }
        }
        System.out.println("There are " + count + " number of integers that are multiple of three.");
    }
}
