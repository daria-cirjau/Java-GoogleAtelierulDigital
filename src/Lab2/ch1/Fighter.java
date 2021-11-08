package Lab2.ch1;

public class Fighter {
    private static int counter=0; //default 0
    private String name;
    private int health;
    private int damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
        counter++;
    }
    public void attack(Fighter f){
        f.health=f.health-damagePerAttack;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDamagePerAttack() {
        return damagePerAttack;
    }

    public static int getNumberOfFighters(){ return counter; }
}
