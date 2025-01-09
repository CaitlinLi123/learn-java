public class StringBuilderDemo1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        // 链式编程
        sb.append(1).append(2.3).append(true);
        System.out.println(sb); // attributes are printed out

        String str = sb.toString();
        System.out.println(str);
    }
}
