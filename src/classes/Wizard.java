package classes;

import java.math.BigDecimal;

public class Wizard extends Character {

    private int mana;
    private double intelligence;

    public Wizard(int id, String name, double hp, boolean isAlive, int mana, double intelligence) {
        super(id, name, hp, isAlive);
        setMana(mana);
        setIntelligence(intelligence);
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public double getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(double intelligence) {
        this.intelligence = intelligence;
    }

    @Override
    public void attack(Character character) {
        //if possible FIREBALL
        //else STAFF HIT
    }

    @Override
    public String toString() {
        return super.toString() + "Wizard{" +
                "mana=" + mana +
                ", intelligence=" + intelligence +
                '}';
    }
}
