public class App {
    public static void main(String[] args) throws Exception {
        // static initialise
        int[] arr1 = new int[] { 11, 12, 13, 14 };
        int[] arr2 = { 11, 12, 13, 14 };

        String[] arr3 = { "Barry", "Yu", "Nick" };

        double[] arr4 = { 1.79, 1.59, 1.81 };
        System.out.println(arr4); // address

        // dynamic intialise
        String[] arr5 = new String[50];
        arr5[0] = "Eamonn";
        System.out.println(arr5[2]); // null

        int[] arr6 = new int[3];
        System.out.println(arr6[0]);
    }
}
