public class Phone {
    // attributes
    String brand;
    double price;
    private String factory;

    public void call() {
        System.out.println("Calling...");
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public String getFactory() {
        return factory;
    }
}
