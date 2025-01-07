public class FunctionOverloading {

    public static void main(String[] args) {
        compare((byte) 0, (byte) 1);
        compare(0, 1);
    }

    public static void compare(byte b1, byte b2) {
        System.out.println(b1 == b2);
    }

    public static void compare(int i1, int i2) {
        System.out.println(i1 == i2);
    }

}