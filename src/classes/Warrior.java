package classes;

import java.math.BigDecimal;

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

    @Override public void attack(Character character) {
        /*
        if(stamina >= 5){
            System.out.println("I'm going to make a Heavy attack");

       

            //setDamage(BigDecimal.valueOf(strength));
            decreaseHP();
            stamina -= 5;
        } else {
            System.out.println("I'm going to make a Weak attack");

            decreaseHP();

            stamina += 1;
        }*/

    }

    @Override
    public String toString() {

        return super.toString() + "Warrior{" +

                "stamina=" + stamina +
                ", strength=" + strength +
                '}';
    }
}
