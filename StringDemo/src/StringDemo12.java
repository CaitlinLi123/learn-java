public class StringDemo12 {
    public static void main(String[] args) {
        // replace sensitive words
        String words = "Hello World";
        words = words.replace("World", "Java");
        System.out.println(words);
    }
}
