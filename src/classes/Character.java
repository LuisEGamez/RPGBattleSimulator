package classes;

import interfaces.Attacker;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Character implements Attacker {
    private int id;
    private String name;
    private double hp;
    private boolean isAlive = true;

   // private BigDecimal damage = new BigDecimal(0);

    public Character(int id, String name, double hp, boolean isAlive) {
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

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;

    }

    public boolean isAlive() {
        return this.isAlive;
    }

    public void setAlive(boolean isAlive) {
        if(this.hp <= 0) {
            this.isAlive = false;
        } this.isAlive = true;
        //hace falta tener ese parametro?
    }

    @Override
    public String toString() {
        return "Character{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                ", isAlive=" + isAlive +
                '}';
    }
}

