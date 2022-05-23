package classes;

import interfaces.Attacker;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Character implements Attacker {
    private int id;
    private String name;
    private BigDecimal hp;
    private boolean isAlive = true;

    private BigDecimal damage;

    public Character(int id, String name, BigDecimal hp, boolean isAlive, BigDecimal damage) {
        setId(id);
        setName(name);
        setHp(hp);
        setAlive(isAlive);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getHp() {
        return hp;
    }

    public void setHp(BigDecimal hp) {
        this.hp = hp.setScale(1, RoundingMode.HALF_EVEN);

    }

    public boolean isAlive() {
        return this.isAlive;
    }

    public void setAlive(boolean isAlive) {
        if(hp.compareTo(BigDecimal.ZERO) <= 0) {
            this.isAlive = false;
        }
        //hace falta tener ese parametro?
    }

    public BigDecimal getDamage() {
        return damage;
    }

    public void setDamage(BigDecimal damage) {

        this.damage = damage.setScale(1, RoundingMode.HALF_EVEN);
    }
    protected void decreaseHP(){
        BigDecimal decrease;
        decrease = hp.subtract(damage);
        System.out.println("Tengo tanto de vida " + decrease);
    }



}
