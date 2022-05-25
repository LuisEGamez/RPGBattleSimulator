import classes.Character;
import classes.Parties;
import classes.Warrior;
import classes.Wizard;

import java.math.BigDecimal;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
<<<<<<< HEAD

        MenuGame.menu();
=======
>>>>>>> af4c97391a0e6873c58a741a31f37570b31781f7

        MenuGame.menu();
        Parties.addCharacter("1",1, "pablo", 50, 50, 100);
        Parties.addCharacter("1",1, "pablo", 50, 50, 100);
        for(Character chr : Parties.userArmy){

        System.out.println(chr.toString());
        }
    }



}
