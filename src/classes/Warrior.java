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
    public void attack(Character character) {
        if( stamina >= 5){
            System.out.println("Heavy Attack");
            character.setHp(character.getHp() - strength); //decreases Hp of enemy
            stamina -= 5;
            //else STAFF HIT
        } else {
            System.out.println("Weak Attack");
            character.setHp(character.getHp() - strength/2);
            stamina += 1;
        }
    }
}




