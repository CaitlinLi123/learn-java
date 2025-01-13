package InheritanceDemo4;

public class Test {
    public static void main(String[] args) {
        Husky h = new Husky();
        Pug p = new Pug();
        ChineseDog cd = new ChineseDog();

        h.eat();
        System.out.println("=========");
        p.eat();
        System.out.println("=========");
        cd.eat();
    }
}
