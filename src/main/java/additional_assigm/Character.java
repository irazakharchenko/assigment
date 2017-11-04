package additional_assigm;
public abstract class Character {
    protected int power;
    protected int hp;
    protected String name;


    public abstract void kick(Character c);
    public boolean isAlive(){
        if (hp < 0)
            hp = 0;
        return hp > 0;
    }

    Character(int power, int hp, String name){
        this.power = power;
        this.hp = hp;
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " power: " + power + ", hp: " + hp ;
    }
}