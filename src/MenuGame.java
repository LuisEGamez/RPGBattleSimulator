import classes.Battle;
import classes.Parties;
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
                    System.out.println("You have to select an appropriate option");
            }
            }catch (Exception e){
                System.out.println("Options are from 0 to 3");
            }
        }while (exit == true);

    }


    public static void createParty(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose 1 for Warrior or 2 for a Wizard");
        try{
        String groupType= scan.nextLine();
        if(groupType.equals("1")){
            System.out.println("Choose a name");
            String warName = scan.nextLine();
            System.out.println("Select Health Points");
            double hpWar = scan.nextDouble();
            System.out.println("Select Stamina");
            int sta = scan.nextInt();
            System.out.println("Choose your Strength");
            double stre = scan.nextDouble();
            Warrior warrior = new Warrior(1, warName, hpWar, true, sta, stre);
            Parties.userArmy.add(warrior);
            System.out.println(" Your warrior is: " + warrior.toString());
        }
        if(groupType.equals("2")){
            System.out.println("Choose a name");
            String wizName = scan.nextLine();
            System.out.println("Select Health points");
            double hpWiz = scan.nextDouble();
            System.out.println("Select Mana");
            int mana = scan.nextInt();
            System.out.println("Select Intelligence");
            double intel = scan.nextDouble();
            Wizard wizard = new Wizard(2, wizName, hpWiz, true, mana, intel);
            System.out.println(wizard.toString());
            Parties.userArmy.add(wizard);
        }

            System.out.println("Would you like to create more characters? \n" +
                    "1. Yes \n" +
                    "2. No \n ");
            int flag = scan.nextInt();
            if(flag == 1){
                createParty();
            }

        }catch (Exception e){
            System.out.println("You can only choose 1 or 2 ");
        }
    }

    public static void importParty(){
    /*need to create a getter method in Parties class so I can call it? ex:
        public List<Character> getList() {
            return userArmy;
        }*/

    }

    private static void fight() {
    }
}
