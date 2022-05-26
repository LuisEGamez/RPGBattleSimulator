package classes;

import java.util.ArrayList;


public class Battle {

    private static ArrayList<Character> party1 = Parties.userArmy;
    private static ArrayList<Character> party2 = Parties.enemyArmy;

    public Battle(ArrayList<Character> party1, ArrayList<Character> party2){
        setParty1(party1);
        setParty2(party2);
    }

    public ArrayList<Character> getParty1() {
        return party1;
    }

    public void setParty1(ArrayList<Character> party1) {
        Battle.party1 = party1;
    }

    public ArrayList<Character> getParty2() {
        return party2;
    }

    public void setParty2(ArrayList<Character> party2) {
        Battle.party2 = party2;
    }


    public static void fight() {
        System.err.println("There's nothing here yet");
    }


    public static void battle (){

        while(!party1.isEmpty() && !party2.isEmpty()){

            System.out.println(party1.get(0).getName() + ", you're attacking!");
            System.out.println("-----------------------------------------------------");

            party1.get(0).attack(party2.get(0));

            System.out.println(party2.get(0).getName() + ", the enemy, is attacking");
            System.out.println("-----------------------------------------------------");
            party2.get(0).attack(party1.get(0));
            if(party2.get(0).getHp() <= 0){
                System.out.println(party1.get(0).getName()+ "Your enemy was sent to the graveyard ");
                System.out.println("-----------------------------------------------------");
                Graveyard.graveyardAdd(party2.remove(0));
            }
            if(party1.get(0).getHp() <= 0){
                System.out.println("Sorry, you're dead, you're going to the graveyard");
                System.out.println("-----------------------------------------------------");
                Graveyard.graveyardAdd(party1.remove(0));
            }
        }

        if(party1.isEmpty()){
            System.out.println("You Lost.... do better next time!");
        } else if (party2.isEmpty()){
            System.out.println("You're the winner!");
        } else {
            System.out.println("It's a tie!");
        }

    }



}