import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);

        // add elements
        list.add("Java");
        list.add("Python");
        System.out.println(list);

        // delete an element
        String str = list.remove(0);
        boolean res = list.remove("list");
        System.out.println(str);
        System.out.println(res);

        // modify an element
        String result = list.set(0, "ddd");
        System.out.println(result);

        // find an element
        String s = list.get(0);
        System.out.println(s);

    }
}
