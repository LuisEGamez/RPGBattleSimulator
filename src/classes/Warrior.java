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
        if(strength >= 1 || strength <= 10) {
            this.strength = strength;
        }
        else {
            System.err.println("You must choose between 1-10");
        }
    }

    @Override public void attack() {
        if(stamina >= 5){
            System.out.println("I'm going to make a Heavy attack");
            //setDamage(BigDecimal.valueOf(strength));
            decreaseHP();
            stamina -= 5;
        } else {
            System.out.println("I'm going to make a Weak attack");

            decreaseHP();
            stamina += 1;
        }

    }


}
