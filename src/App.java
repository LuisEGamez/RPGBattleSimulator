import classes.Warrior;
import classes.Wizard;

import java.math.BigDecimal;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        MenuGame.menu();
        ArrayList<? extends Character> userArmy = new ArrayList<>();
        ArrayList<? extends Character> enemyArmy = new ArrayList<>();

    }

    public static ArrayList<? extends Character> addCharacter(String type, int id, String name,
                                                              BigDecimal hp, BigDecimal damage,
                                                              int staminaMana, double strengthIntelligence) {

        switch(type) {
            case "1":
                Warrior warrior = new Warrior(id, name, hp, true, damage, staminaMana, strengthIntelligence);
                userArmy.add(warrior);
                break;
            case "2":
                Wizard wizard = new Wizard(id, name, hp, true, damage, staminaMana, strengthIntelligence);
                userArmy.add(wizard);
        }
    }

}
