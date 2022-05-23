package classes;

import java.util.ArrayList;
import java.util.List;

public class Warrior extends Character {
    private int stamina;
    private int strength;

    public Warrior(int id, String name, int hp, boolean isAlive, int stamina, int strength) {
        super(id, name, hp, isAlive);
        setStamina(stamina);
        setStrength(strength);
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }


    @Override
    public int attack() {
        if( stamina >= 5){
            int damage = stamina ;
            setHp(damage);
            decreaseHp (damage); //?? of target
            stamina = strength - 5;
            //else STAFF HIT
        } else {
            int damage = strength/2 ;
            setHp (damage);
            decreaseHp(damage); // ??of target
            stamina += 1;
        }
        return stamina;
    }
}




