package InheritanceDemo1;

public class Dog extends Animal {
    private String breed;

    public Dog() {
    }

    public Dog(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void houseKeeping() {
        System.out.println(breed + "is housekeeping...");
    }
}
