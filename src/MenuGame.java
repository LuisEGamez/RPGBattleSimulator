import classes.Battle;
import classes.Parties;
import classes.Warrior;
import classes.Wizard;

import java.math.BigDecimal;
import java.util.Scanner;

public class MenuGame {
    public static void menu(){
        boolean exit = false;
        Scanner scan = new Scanner(System.in);
        do{
            try{

            System.out.println("**************************************");
            System.out.println("\t\t\t\tWelcome");
            System.out.println("**************************************");
            System.out.println("Please choose one of the options below: \n" +
                    " 1. Create a Party \n" +
                    " 2. Import a Party \n" +
                    " 3. Fight \n" +
                    " 0. Exit the Game \n");
            int selection = scan.nextInt();

            switch (selection){
                case 0:
                    System.out.println("You have exited the game");
                    exit = true;
                    break;
                case 1:
                    Parties.createParty();
                    break;
                case 2:
                    Parties.importParty();
                    break;
                case 3:
                    if(Parties.userArmy.size() != 0) {
                        Parties.createRandomEnemyParty();
                        Battle.battle();
                    }
                    else System.err.println("Your army is empty! Create or import a party.");
                    break;
                default:
                    System.out.println("You have to select an appropriate option");
            }
            }catch (Exception e){
                System.out.println("Options are from 0 to 3");
            }
        }while (!exit);

    }

}
