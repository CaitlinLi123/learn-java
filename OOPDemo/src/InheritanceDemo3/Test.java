package InheritanceDemo3;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.lunch();

        InternationalStudent is = new InternationalStudent();
        is.drink();
    }
}

class Person {
    public void eat() {
        System.out.println("Eating...");
    }

    public void drink() {
        System.out.println("Drinking...");
    }
}

class Student extends Person {
    public void lunch() {
        // If there's no eat and drink method in this class, it will call methods from
        // parent class
        eat();
        drink();

        // specify calling methods from parent class
        super.eat();
    }
}

class InternationalStudent extends Student {
    @Override
    public void eat() {
        System.out.println("Eating pasta...");
    }

    public void drink() {
        System.out.println("Drinking Guinness...");
    }
}
