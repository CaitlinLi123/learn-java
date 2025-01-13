package PolymorphismDemo1;

public class Student extends Person {
    @Override
    public void show() {
        System.out.println("Student info: " + getName() + ", " + getAge());
    }
}
