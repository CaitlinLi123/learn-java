package StaticDemo1;

public class Student {
    private String name;
    private int age;
    private String gender;
    public static String teachName = "Yu";

    public Student() {

    };

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    // action
    public void study() {
        System.out.println(name + " is studying...");
    }

    public void show() {
        System.out.println(name + " " + age + " " + gender + " " + teachName);
    }
}
