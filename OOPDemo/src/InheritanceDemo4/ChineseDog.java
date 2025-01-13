package InheritanceDemo4;

public class ChineseDog extends Dog {
    private String food = "leftover";

    @Override
    public void eat() {
        System.out.println("Eating " + food + "....");
    }
}
