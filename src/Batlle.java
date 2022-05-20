import java.util.ArrayList;

public class Batlle {
    private ArrayList<Character> party1;
    private ArrayList<Character> party2;

    public Batlle(Character[] party1, Character[] party2){
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
}
