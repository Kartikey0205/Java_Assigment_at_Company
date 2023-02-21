package FlipCoinProg;

import java.util.ArrayList;

public class Player {
    public static String playerName;
    public static int Age;
    public static String askedCoin;
    public static ArrayList<Player> totalPlayerList = new ArrayList<Player>();


    Player(String name, int age) {
        playerName = name;
        Age = age;
    }

    public static void choice(Player player1, Player player2, String choice , int turn) {
        if (choice.equals("head") &&(turn == 1)) {
            player1.askedCoin = "head";
            player2.askedCoin = "tail";
        } else if(choice.equals("tail") &&(turn == 1)){
            player1.askedCoin = "tail";
            player2.askedCoin = "head";
        }else if (choice.equals("head") &&(turn == 2)) {
            player2.askedCoin = "head";
            player1.askedCoin = "tail";
        }else{
            player2.askedCoin = "tail";
            player1.askedCoin = "head";
        }
    }

    public static void displayStatus(String name, int status) {
        System.out.println(name + " points = " + status);
    }
}
