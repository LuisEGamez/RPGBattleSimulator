package classes;

import java.math.BigDecimal;

public class Warrior extends Character {
    private int stamina;
    private double strength;

    public Warrior(int id, String name, BigDecimal hp, boolean isAlive, BigDecimal damage, int stamina, double strength) {
        super(id, name, hp, isAlive, damage);
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

    @Override public void attack() {
        if(stamina >= 5){
            System.out.println("I'm going to make a Heavy attack");
            setDamage(BigDecimal.valueOf(strength));
            stamina -= 5;
        } else {
            System.out.println("I'm going to make a Weak attack");
            setDamage(BigDecimal.valueOf((strength / 2)));
            stamina += 1;
        }

    }


}
