package Ex3;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car[] arr = new Car[3];

        for (int i = 0; i < arr.length; i++) {
            Car c = new Car();

            System.out.println("Brand:");
            String brand = sc.next();

            System.out.println("price: ");
            double price = sc.nextDouble();

            System.out.println("Color:");
            String color = sc.next();

            c.setBrand(brand);
            c.setColor(color);
            c.setPrice(price);

            arr[i] = c;
        }
    }
}
