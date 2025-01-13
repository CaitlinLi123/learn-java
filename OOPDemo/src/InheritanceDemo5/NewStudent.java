package InheritanceDemo5;

public class NewStudent extends Person {
    String name;
    int age;
    String school;

    public NewStudent() {
        this(null, 0, "UCD");
    }

    public NewStudent(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }
}
