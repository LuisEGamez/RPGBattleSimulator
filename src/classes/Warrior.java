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
        if(strength >= 1 || strength <= 10) {
            this.strength = strength;
        }
        else {
            System.err.println("You must choose between 1-10");
        }
    }


    @Override
    public void attack(Character character) {
        if (stamina >= 5) {
            System.out.println("Heavy Attack");
            character.setHp(character.getHp() - strength); //decreases Hp of enemy
            stamina -= 5;
            System.out.println("Now Warrior " + getName() + " has " + getHp() + " health points\n  and " + getStamina() +
                    "  stamina points.");

        } else {
            System.out.println("Weak Attack");
            character.setHp(character.getHp() - strength / 2);
            stamina += 1;
            System.out.println("Now Warrior " + getName() + " has " + getHp() + " health points\n  and " + getStamina() +
                    "  stamina points.");
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




