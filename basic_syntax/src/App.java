import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        String name = "Susan";
        System.out.println(name.toUpperCase());
        Animal a = new Animal();
        System.out.println(
                addExclamationPoint(a.iAmDog()));

    }

    public static String addExclamationPoint(String s) {
        // System.out.println(s + "!");
        return s + "!";
    }
}
