package StaticDemo1;

public class StudentTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Yu");
        s1.setAge(24);
        s1.setGender("Female");

        Student s2 = new Student();
        s2.setName("Barry");
        s2.setAge(26);
        s2.setGender("Male");

        s1.study();
        s1.show();

    }
}
