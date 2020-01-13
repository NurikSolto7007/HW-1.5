package Codings;

import java.util.Random;
import java.util.RandomAccess;

public class Boss {
    private int health;
    private int hit;
    private int defence;

    public void changeBossDefence() {
        Random random = new Random();
        int num = random.nextInt(3) + 1;
        setDefence(num);
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }
    public void printInfo() {
        System.out.println("Health: "+health+" Hit: "+hit+" Defence: "+defence);
    }
}
