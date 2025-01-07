public class Ex1 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        printArr(arr);
        System.out.println();
        System.out.println(getMax(arr));
        System.out.println(checkElement(arr, 0));
    }

    // traverse an array and print the result in one line
    public static void printArr(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }

        }
        System.out.print("]");
    }

    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    // check whether an element is in the array
    public static boolean checkElement(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }
}
