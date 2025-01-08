package Ex1;

public class FighterTest {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Yu", 100);
        Fighter f2 = new Fighter("Barry", 100);

        int hp1 = f1.getHp();
        int hp2 = f2.getHp();

        while (hp1 > 0 && hp2 > 0) {
            f1.fight(f2);
            f2.fight(f1);
            hp1 = f1.getHp();
            hp2 = f2.getHp();
        }

        System.out.println("Finished!");
    }

}
