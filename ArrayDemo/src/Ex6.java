import java.util.Random;

public class Ex6 {
    // shuffle the elements in an array
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        arr = shuffle(arr);
        for (int ele : arr) {
            System.out.println(ele);
        }
    }

    public static int[] shuffle(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex = r.nextInt(arr.length);
            int temp = arr[randomIndex];
            arr[randomIndex] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
