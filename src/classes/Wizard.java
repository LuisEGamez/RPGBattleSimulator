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
    public int attack() {
        //if possible FIREBALL
        if( mana >= 5){
            int damage = intelligence * -1;
            setHp(damage);
            decreaseHp (damage); //?? of target
            mana = intelligence - 5;
            //else STAFF HIT
        } else {
            int damage = (intelligence- 2) * -1;
            setHp (damage);
            decreaseHp(damage); // ??of target
            mana += 1;
        }
        return mana;

    }
}
