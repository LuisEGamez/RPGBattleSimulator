package classes;

import java.util.ArrayList;


public class Battle {
    private ArrayList<? extends Character> party1;
    private ArrayList<? extends Character> party2;

    public Battle(ArrayList<? extends Character> party1, ArrayList<? extends Character> party2){
        setParty1(party1);
        setParty2(party2);
    }

    public ArrayList<? extends Character> getParty1() {
        return party1;
    }

    public void setParty1(ArrayList<? extends Character> party1) {
        this.party1 = party1;
    }

    public ArrayList<? extends Character> getParty2() {
        return party2;
    }

    public void setParty2(ArrayList<? extends Character> party2) {
        this.party2 = party2;
    }


    public static void fight() {
        System.err.println("There's nothing here yet");
    }

    public void battle (){
        int counter = 0;
        while(!party1.isEmpty() && !party2.isEmpty()){
            if(counter % 2 == 0){
                party1.get(0).attack(party2.get(0));
                if(party2.get(0).getHp() <= 0){
                    Graveyard.graveyardAdd(party2.remove(0));
                }
            } else {
                party2.get(0).attack(party1.get(0));
                if(party1.get(0).getHp() <= 0){
                    Graveyard.graveyardAdd(party1.remove(0));
                }
            }

            counter++;


        }
    }



}