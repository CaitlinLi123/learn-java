import java.util.Random;

public class Ex4 {
    // generate 10 1-100 random integers, put them into array
    // get the sum, average and the number of ints lower than average
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            int num = r.nextInt(100) + 1;
            arr[i] = num;
        }
        System.out.println("Sum: " + getSum(arr));
        System.out.println("Average: " + getAverage(arr));
        System.out.println("There are " + getLowerThanAverage(arr) + " ints less than average.");
    }

    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int getAverage(int[] arr) {
        int average = 0;
        int sum = getSum(arr);
        average = sum / arr.length;
        return average;
    }

    public static int getLowerThanAverage(int[] arr) {
        int count = 0;
        int average = getAverage(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < average) {
                count++;
            }
        }
        return count;
    }
}
