package classes;

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
        if( mana >= 5){

            System.out.println(getName() + " is using Fireball attack!");
            System.out.println("-----------------------------------------------------");
            character.setHp(character.getHp() - intelligence);
            mana -= 5;

            System.out.println(toString());
            System.out.println("-----------------------------------------------------");
        } else {

            System.out.println(getName() + " is using Staff hit attack!");
            System.out.println("-----------------------------------------------------");
            character.setHp(character.getHp() - 2);
            mana += 1;

            System.out.println(toString());
            System.out.println("-----------------------------------------------------");
        }
    }


    @Override
    public String toString() {
        return super.toString()  +
                ", mana= " + mana  +
                ", intelligence= " + intelligence ;
    }
}
