package InheritanceDemo1;

public class Cat extends Animal {
    private String breed;

    public Cat() {

    }

    public Cat(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void catchMouse() {
        System.out.println("Catch a mouse.");
    }
}
