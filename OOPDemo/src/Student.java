public class Student {
    private String name;
    private int age;

    public Student() {
        System.out.println("This is a constructor without variables inputed.");
    }

    // constructor with variables
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
