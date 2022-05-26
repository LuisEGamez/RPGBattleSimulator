package classes;

import java.util.ArrayList;
import java.util.List;

public class Graveyard {
    private static List<Character> graveyardList = new ArrayList<>();
    public static void graveyardAdd (Character character){
        graveyardList.add(character);
    }

    public static void printGraveyardArray (){

        final String ANSI_BLACK = "\u001B[30m";

        System.out.printf(ANSI_BLACK + "             +\n" +
                "                                    |\n" +
                "                                   ,|,\n" +
                "                                   |||\n" +
                "                                  / | \\\n" +
                "                                  | | |\n" +
                "                                  | | |\n" +
                "                                 /  |  \\\n" +
                "                                 |  |  |\n" +
                "                                 |  |   \\\n" +
                "                                /    \\  |\n" +
                "                                |    |  |\n" +
                "                                |    |   \\\n" +
                "                               /     |   |\n" +
                "                8              |     |   |\n" +
                "              \"\"8\"\"           /      |    \\\n" +
                "                8            /        \\   ,\\\n" +
                "              ,d8888888888888|========|=\"\" |\n" +
                "            ,d\"  \"88888888888|  ,aa,  |  a |\n" +
                "          ,d\"      \"888888888|  8  8  |  8 |\n" +
                "       ,d8888888b,   \"8888888|  8aa8  |  8,|\n" +
                "     ,d\"  \"8888888b,   \"88888|========|=\"\" |\n" +
                "   ,d\"      \"8888888b,   \"888|  a  a  |  a |\n" +
                " ,d\"   ,aa,   \"8888888b,   \"8|  8  8  |  8,|\n" +
                "/|    d\"  \"b    |\"\"\"\"\"\"|     |========|=\"\" |\n" +
                " |    8    8    |      |     |  ,aa,  |  a |\n" +
                " |    8aaaa8    |      |     |  8  8  |  8 |\n" +
                " |              |      |     |  \"\"\"\"  | ,,=|\n" +
                " |aaaaaaaaaaaaaa|======\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\n");

        final String ANSI_YELLOW = "\u001B[33m";

        if(graveyardList.size() != 0) {
            System.err.println("Show your respects to the fallen");
            for(int i = 0; i <= graveyardList.size(); i++){
                System.out.println("+ " + graveyardList.get(i).getName());
            }
        } else {
            System.out.println(ANSI_YELLOW + "It's so quiet here, in this empty graveyard... \n");
        }

    }
}
