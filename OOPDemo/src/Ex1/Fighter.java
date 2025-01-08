package Ex1;

import java.util.Random;

public class Fighter {
    private String name = "fighter";
    private int hp = 100;

    public Fighter(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getHp() {
        return hp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void fight(Fighter opponent) {
        if (this.hp > 0) {
            int opponentHp = opponent.getHp();
            String opponentName = opponent.getName();
            Random r = new Random();
            int damage = r.nextInt(20);
            opponent.setHp(opponentHp - damage);

            int newOpponentHp = opponent.getHp();
            System.out.println(
                    this.name + " cause damage of " + damage + " to " + opponentName + ". Now the hp is: "
                            + newOpponentHp);
            if (newOpponentHp <= 0) {
                System.out.println(this.name + " kills " + opponentName);
            }
            ;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}
