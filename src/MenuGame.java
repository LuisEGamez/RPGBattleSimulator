import classes.Battle;
import classes.Warrior;
import classes.Wizard;

import java.math.BigDecimal;
import java.util.Scanner;

public class MenuGame {
    public static void menu(){
        boolean exit = true;
        Scanner scan = new Scanner(System.in);
        do{
            try{

            System.out.println("**************************************");
            System.out.println("\t\t\tWelcome");
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
                    exit = false;
                    break;
                case 1:
                    createParty();
                    break;
                case 2:
                    importParty();
                    break;
                case 3:
                    fight();
                    break;
                default:
                    System.out.println("You have to select an approprite option");
            }
            }catch (Exception e){
                System.out.println("Choose from 0 to 3");
            }
        }while (exit == true);

    }


    public static void createParty(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose 1 for Warrior or 2 for a Wizard");
        String groupType= scan.nextLine();
        if(groupType == "1"){
            System.out.println("Choose a name");
            String warName = scan.nextLine();
            System.out.println("Select health points");
            double hpWar = scan.nextDouble();
            System.out.println("Select damage");
            double damage = scan.nextDouble();
            System.out.println("Select stamina");
            int sta = scan.nextInt();
            System.out.println("Choose your Strength");
            double stre = scan.nextDouble();
            Warrior warrior = new Warrior(1, warName, hpWar, true, damage, sta, stre);
            System.out.println(warrior.toString());
            userArmy.add(warrior);
        }
        if(groupType == "2"){
            System.out.println("Choose a name");
            String wizName = scan.nextLine();
            System.out.println("Select health points");
            double hpWiz = scan.nextDouble();
            System.out.println("Select damage");
            double damage = scan.nextDouble();
            System.out.println("Mana");
            int mana = scan.nextInt();
            System.out.println("Intelligence");
            double intel = scan.nextDouble();
            Wizard wizard = new Wizard(2, wizName, hpWiz, true, damage, mana, intel);
            System.out.println(wizard.toString());
            userArmy.add(wizard);
        }
    }

    public static void importParty(){

    }

    private static void fight() {
    }
}
