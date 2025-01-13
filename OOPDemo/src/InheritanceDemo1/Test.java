package InheritanceDemo1;

public class Test {
    public static void main(String[] args) {
        Dog husky = new Dog("Husky");
        Dog randall = new Dog("Basset Hound");
        Cat cat1 = new Cat("cat1");
        Cat cat2 = new Cat("cat2");

        husky.houseKeeping();
        randall.houseKeeping();
        cat1.eat();
        cat2.drink();
    }
}
