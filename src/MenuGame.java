import java.util.Scanner;

public class MenuGame {
    public static void menu(){
        boolean exit = true;
        Scanner scan = new Scanner(System.in);
        do{
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
                    System.out.println(" 1");
                    break;
                case 2:
                    System.out.println("2");
                    break;
                case 3:
                    System.out.println("3");
                    break;
                default:
                    System.out.println("You have to select an approprite option");
            }
        }while (exit == true);

    }
}
