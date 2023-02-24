package FlipCoin;

import java.util.ArrayList;
import java.util.List;

import JavaAssignment.*;

public class Game {
    // 0 == Head
    // 1 == Tail
    public static int totalNumberPlayer;
    public static int chance = 0;

    public static ArrayList<String> totalPlayerList = new ArrayList<String>();
    public static ArrayList<Integer> playerScore = new ArrayList<Integer>();
    public static ArrayList<String> playerChoice = new ArrayList<String>();

    public static void startGame() {
        System.out.println(" \n\t\tFlip Coin Game..");
        System.out.println("\tRule for Game is if any player gets 3 points  he wins..\n");
        totalNumberPlayer = GetUserInput.getInt("\n\tEnter total number of Players of the Game..");

        while (!UtilityFunc.minNumber(totalNumberPlayer)) {
            totalNumberPlayer = GetUserInput.getInt("\n\t Min Number of Players in the game must be 2");

        }

        playerInitailize(totalNumberPlayer);
        playGame();
    }

    public static void playerInitailize(int totalPlayer) {
        for (int playerNum = 0; playerNum < totalPlayer; playerNum++) {
            System.out.println("\tPlayer - " + (playerNum + 1));
            new Player(GetUserInput.getString("Enter you Name"), playerNum);

        }

    }

    public static void playGame() {
        chance = chance + 1;
        System.out.println("\n\t\t----Chance - " + chance + "------\n");
        for (int i = 0; i < totalNumberPlayer; i++) {

            String choice = GetUserInput
                    .getString(totalPlayerList.get(i) + " turns--> \n Choose head or Tail");
            playerChoice.add(i, choice);
            Player.displayChoice(i);
            Coin.coinTossed();
            Boolean scoreGain = Player.updatePoints(i, Coin.randomNumber); // True or False
            System.out.println("..Points..");

            if (scoreGain.equals(true)) {
                resultOfGame(i, true);
            } else {
                resultOfGame(i, false);

            }
            printStatus(totalNumberPlayer);
        }
        playGame();
    }

    public static void resultOfGame(int index, boolean pointGain) {
        if (pointGain) {
            System.out.println(
                    "\t" + totalPlayerList.get(index) + " gained 1 point and his Point = " + playerScore.get(index));
        } else {
            System.out.println("\tNo points gained as choice doesn't match with toss");
        }

        if (playerScore.get(index) == 3) {
            winner(totalPlayerList.get(index));

            System.exit(-1);
        }

    }

    public static void printStatus(int totalPlayer) {
        System.out.println("\nScore of Game");
        for (int i = 0; i < totalPlayer; i++) {
            System.out.println("\t" + totalPlayerList.get(i) + " = " + playerScore.get(i));

        }

    }

    public static void winner(String name) {
        System.out.println("\n" + name + " wins the match");
    }

}
