package classes;

import java.util.ArrayList;
import java.util.List;

public class Graveyard {
    private static List<Character> graveyardList = new ArrayList<>();
    public static void graveyardAdd (Character character){
        graveyardList.add(character);
    }

    public static void printGraveyardArray (){
        for(int i = 0; i <= graveyardList.size(); i++){
            System.out.println("+ " + graveyardList.get(i).getName());
        }
    }
}
