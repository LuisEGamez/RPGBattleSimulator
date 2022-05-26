import classes.Character;
import classes.Parties;
import classes.Warrior;
import classes.Wizard;

import java.math.BigDecimal;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) {


         MenuGame.menu();




        Parties.addCharacter("1",1, "pablo", 50, 50, 100);
        Parties.createRandomParty();
        Parties.createRandomEnemyParty();


        for(Character chr : Parties.userArmy){
            System.out.println(chr);


        System.out.println("TEST" + chr.toString());
        }
        System.out.println("===========");
        for(Character chr : Parties.enemyArmy){


            System.out.println(chr.toString());
        }

    }



}
