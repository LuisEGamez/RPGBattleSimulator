package classes;

import java.util.ArrayList;

public class Battle {
    private ArrayList<java.lang.Character> party1;
    private ArrayList<java.lang.Character> party2;

    public Battle(java.lang.Character[] party1, java.lang.Character[] party2){
        setParty1(party1);
        setParty2(party2);
    }

    public ArrayList<java.lang.Character> getParty1() {
        return party1;
    }

    public void setParty1(ArrayList<java.lang.Character> party1) {
        this.party1 = party1;
    }

    public ArrayList<java.lang.Character> getParty2() {
        return party2;
    }

    public void setParty2(ArrayList<java.lang.Character> party2) {
        this.party2 = party2;
    }
}
