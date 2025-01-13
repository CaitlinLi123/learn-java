package InheritanceDemo5;

public class Student extends Person {
    public Student() {
        super(); // call non parameter constructor
        System.out.println("student");
    }

    public Student(String name, int age) {
        super(name, age);
    }
}
