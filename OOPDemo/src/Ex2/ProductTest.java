package Ex2;

public class ProductTest {
    public static void main(String[] args) {
        Product[] arr = new Product[3];
        Product p1 = new Product("001", "usb", 100, 1);
        Product p2 = new Product("002", "usb", 100, 1);
        Product p3 = new Product("003", "usb", 100, 1);

        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;

        for (int i = 0; i < arr.length; i++) {
            Product p = arr[i];
            System.out.println("Product:" + p.getId() + " " + p.getName());
        }
    }
}
