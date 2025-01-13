package PolymorphismDemo1;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setAge(20);
        s.setName("Yu");

        Teacher t = new Teacher();
        t.setAge(30);
        t.setName("Barry");

        register(s);
        register(t);
    }

    // want to have Student and Teacher be the input
    // parameter type should be their parent class
    public static void register(Person p) {
        p.show();
    }
}
