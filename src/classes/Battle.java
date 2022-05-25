package classes;

import java.util.ArrayList;


public class Battle {

    private ArrayList<Character> party1 = Parties.userArmy;
    private ArrayList<Character> party2 = Parties.enemyArmy;

    public Battle(ArrayList<Character> party1, ArrayList<Character> party2){
        setParty1(party1);
        setParty2(party2);
    }

    public ArrayList<Character> getParty1() {
        return party1;
    }

    public void setParty1(ArrayList<Character> party1) {
        this.party1 = party1;
    }

    public ArrayList<Character> getParty2() {
        return party2;
    }

    public void setParty2(ArrayList<Character> party2) {
        this.party2 = party2;
    }


    public static void fight() {
        System.err.println("There's nothing here yet");
    }


    public static void battle (){

        while(!party1.isEmpty() || !party2.isEmpty()){
            party1.get(0).attack(party2.get(0));
            System.out.println("You're attacking!");
            party2.get(0).attack(party1.get(0));
            System.out.println("The enemy is attacking");
            if(party2.get(0).getHp() <= 0){
                System.out.println("Your enemy was sent to the graveyard ");
                Graveyard.graveyardAdd(party2.remove(0));
            } else {
                System.out.println("Sorry, you're dead, you're going to the graveyard");
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