package StaticDemo3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student stu1 = new Student("Yu", 24, "Female");
        Student stu2 = new Student("Yu2", 25, "Female");
        Student stu3 = new Student("Yu3", 26, "Female");

        list.add(stu1);
        list.add(stu2);
        list.add(stu3);

        int maxAgeStudent = StudentUtil.getMaxAgeStudent(list);
        System.out.println(maxAgeStudent);
    }
}
