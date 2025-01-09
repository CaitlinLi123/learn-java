package ArrayListDemo3;

import java.util.ArrayList;

public class ArrayListDemo3 {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("yu", 23);
        Student s2 = new Student("Barry", 25);

        list.add(s1);
        list.add(s2);

        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getName());
        }
    }
}
