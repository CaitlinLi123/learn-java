package InheritanceDemo2;

public class Test {
    public static void main(String[] args) {
        GrandSon gs = new GrandSon();
        gs.show();

        // constructor is not inherited
        // Child c2 = new Child("a",23);
    }
}

class Parent {
    String name = "parent";
    int age;

    public Parent() {
    }

    public Parent(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Child extends Parent {
    String name = "child";
}

class GrandSon extends Child {
    String name = "grandson";

    public GrandSon() {
    }

    public void show() {
        System.out.println(super.name);
        System.out.println(this.name);
    }
}
