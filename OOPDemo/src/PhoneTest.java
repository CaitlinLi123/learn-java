public class PhoneTest {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.brand = "apple";
        phone.price = 1000;

        System.out.println(phone.brand);
        System.out.println(phone.price);
        phone.call();

        phone.setFactory("Foxconn");
        System.out.println(phone.getFactory());
    }
}
