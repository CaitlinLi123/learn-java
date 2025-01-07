public class Ex2 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int[] newArr = copyOfRange(arr, 0, 5);
        for (int i : newArr) {
            System.out.println(i);
        }
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] newArr = new int[to - from];
        int count = 0;
        for (int i = from; i < to; i++) {
            newArr[count] = arr[i];
            count++;
        }
        return newArr;
    }
}
