package Codings;

public class Main {

    public static void main(String[] args) {
        Hero h1 = new Hero(200, 20, "Physical");
        Hero h2 = new Hero(220, 20, "Magical");
        Hero h3 = new Hero(200, 20, "Kinetic");
        Hero h4 = new Hero(200, 20, "Medical");

        h1.printInfo();
        h2.printInfo();
        h3.printInfo();
        h4.printInfo();

        Boss boss = new Boss();
        boss.setDefence(0);
        boss.setHit(50);
        boss.setHealth(1000);
        boss.printInfo();

        MagicDoor magicDoor = new MagicDoor();
        magicDoor.generateHeroes();


    }

    }
