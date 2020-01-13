package Codings;

public class MagicDoor {
    public Hero[] generateHeroes() {
        Hero[] heroesArr = new Hero[4];
        Hero warrior = new Hero(200, 20, "Physical");
        heroesArr[0] = warrior;
        Hero magic = new Hero(220, 20, "Magical");
        heroesArr[1] = magic;
        Hero mental = new Hero(200, 20, "Kinetic");
        heroesArr[2] = mental;
        Hero medic = new Hero(200, 20, "Medical");
        heroesArr[3] = medic;
        return heroesArr;
    }

}
