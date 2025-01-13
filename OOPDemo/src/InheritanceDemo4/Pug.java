package InheritanceDemo4;

public class Pug extends Dog {
    private String food = "bone";

    @Override
    public void eat() {
        super.eat();
        System.out.println("Eating " + food + "...");
    }
}
