import classes.*;

import java.io.FileNotFoundException;
import java.lang.Character;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuGame {
    public static void menu(){

        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED = "\u001B[31m";
        final String ANSI_BLUE = "\u001B[34m";
        final String ANSI_PURPLE = "\u001B[35m";
        final String ANSI_WHITE = "\u001B[37m";
        final String ANSI_CYAN = "\u001B[36m";

        boolean exit = false;
        Scanner scan = new Scanner(System.in);
        do{
            try{

            System.out.println(ANSI_CYAN + "**************************************");
            System.out.println("*\tWelcome to RPG Battle Simulator\t *");
            System.out.println("************************************** \n");
            System.out.println(ANSI_PURPLE + "Please choose one of the options below: \n" +
                    " 1. Create a Party \n" +
                    " 2. Import a Party \n" +
                    " 3. Delete a Party  \n" +
                    " 4. Fight \n" +
                    " 5. +Graveyard+ \n" +
                    " 0. Exit the Game \n");

                if (Parties.userArmy.size() == 0) {
                    System.err.println("Your army is empty and enemies are getting closer!");
                } else {
                    System.out.println(ANSI_RESET + "Your army: " + Parties.userArmy);
                }

                int selection = scan.nextInt();


            switch (selection){
                case 0:
                    System.out.println(ANSI_WHITE + "You have exited the game");
                    exit = true;
                    break;
                case 1:
                    System.out.println(ANSI_BLUE + "Would you like to create a party Manually or Randomly? " +
                            "\n");
                    System.out.println(ANSI_PURPLE + "Select: \n" +
                            "1. For Manually \n" +
                            "2. For Randomly");
                        int choice= scan.nextInt();
                        if(choice == 1){
                            Parties.createParty();
                        }else{
                            Parties.createRandomParty();
                        }
                    break;
                case 2:
                    Parties.importParty();
                    break;
                case 3:
                    ArrayList<Character> userArmyCopy = (ArrayList<Character>) Parties.userArmy.clone();
                    Parties.userArmy.removeAll(userArmyCopy);
                    System.out.println(ANSI_RED + "The army has been deleted");
                    break;
                case 4:
                    if(Parties.userArmy.size() != 0) {
                        Parties.createRandomEnemyParty();
                        Battle.battle();
                    }
                    else System.err.println("Your army is empty! Create or import a party.");
                    break;
                case 5:
                    Graveyard.printGraveyardArray();
                    break;
                default:
                    System.err.println("You have to select an appropriate option");
            }
            }catch (Exception e){
                System.out.println(ANSI_WHITE + "Options are from 0 to 5 \n");
                scan.next();
            }
        }while (!exit);

    }

}
