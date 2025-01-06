public class Ex5 {
    // swap the given indices element in an array
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        arr = swapElement(arr, 0, arr.length - 1);
        System.out.println("After swapping 2 elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int[] arr2 = { 1, 2, 3, 4, 5 };
        arr = transformArray(arr2, 0, arr.length - 1);
        System.out.println("After transforming: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }

    public static int[] swapElement(int[] arr, int index1, int index2) {
        int tmp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tmp;
        return arr;
    }

    public static int[] transformArray(int[] arr, int index1, int index2) {
        int i = Integer.min(index1, index2);
        int j = Integer.max(index2, index1);
        while (i < j) {
            arr = swapElement(arr, i, j);
            i++;
            j--;
        }
        return arr;
    }
}
