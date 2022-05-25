package classes;


import java.util.ArrayList;
import java.util.List;



public class Warrior extends Character {
    private int stamina;
    private double strength;

    public Warrior(int id, String name, double hp, boolean isAlive, int stamina,
                   double strength) {
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

    public double getStrength() {
        return strength;
    }

    public void setStrength(double strength) {
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

    @Override
    public String toString() {
        return super.toString()  + "Warrior{" +
                "stamina=" + stamina +
                ", strength=" + strength +
                '}';
    }
}




