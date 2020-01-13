package Codings;

public class Hero {
   private int health;
   private int hit;
   private String hitsType;

    public Hero(int health, int hit, String hitsType) {
        this.health = health;
        this.hit = hit;
        this.hitsType = hitsType;
    }
    public void printInfo (){
        System.out.println("Health: "+health+" Hit: "+hit+" Hits Type: "+hitsType);
    }
}
