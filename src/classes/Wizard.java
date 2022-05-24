package classes;

public class Wizard extends Character {

    private int mana;
    private int intelligence;

    public Wizard(int id, String name, int hp, boolean isAlive, int mana, int intelligence) {
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

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }


    @Override
    public int void attack(Character character) {
        //if possible FIREBALL
        if( mana >= 5){
            System.out.println("Fireball");
            character.setHp(character.getHp() - intelligence);
            mana -= 5;
            //else STAFF HIT
        } else {
            System.out.println("Staff hit");
            character.setHp(character.getHp() - 2);
            mana += 1;
        }
    }
}
