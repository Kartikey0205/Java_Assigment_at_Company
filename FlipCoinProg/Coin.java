package FlipCoinProg;

import java.util.*;
// import java.util.Scanner;

public class Coin {

    public static String player_1_Name, player_2_Name;
    public static int chance = 1;
    public static int turn = 1; // 1 = player1 turn and 2 player 2 turn
    public static int match_win_1 = 0;
    public static int match_win_2 = 0;
    public static Player player1;
    public static Player player2;
    public static String playerChoice;

    public static Random r = new Random();
    public static int randomNumber = r.nextInt(0, 2);

    // 0 == Head
    // 1 == Tail
    public static void playerInitailize() {
        player_1_Name = GetUserInput.getString("Player 1 -- \n Enter Your Name");
        player1 = new Player(player_1_Name, GetUserInput.getInt("Enter your Age"));

        player_2_Name = GetUserInput.getString("Player 2 -- \n Enter Your Name");
        player2 = new Player(player_2_Name, GetUserInput.getInt("Enter your Age"));
    }

    public static void coinTossed() {

        System.out.println("\n\t-------Chance " + chance + "-----------");

        if (turn == 1) {
            playerChoice = GetUserInput.getString(player_1_Name + " Turn \n -->  Choose head or tail");

        } else {
            playerChoice = GetUserInput.getString(player_2_Name + " Turn \n-->  Choose head or tail");

        }
        Player.choice(player1, player2, playerChoice, turn);

        if (turn == 1) {
            if ((randomNumber == 0) && (playerChoice.equals("head"))) {
                System.out.println("Coin Tossed and its Heads appears");
                match_win_1++;
            } else if ((randomNumber == 1) && (playerChoice.equals("tail"))) {
                System.out.println("Coin Tossed and its Tails appears");
                match_win_1++;
            } else if ((randomNumber == 1) && (playerChoice.equals("head"))) {
                System.out.println(" Coin Tossed and its Tail appears");
                match_win_2++;
            } else if ((randomNumber == 0) && (playerChoice.equals("tail"))) {
                System.out.println("Coin Tossed and its Heads appears ");
                match_win_2++;
            }
        }

        else {
            if ((randomNumber == 0) && (playerChoice.equals("head"))) {
                System.out.println("Coin Tossed and its Heads appears");
                match_win_2++;
            } else if ((randomNumber == 1) && (playerChoice.equals("tail"))) {
                System.out.println("Coin Tossed and its Tails appears");
                match_win_2++;
            } else if ((randomNumber == 1) && (playerChoice.equals("head"))) {
                System.out.println(" Coin Tossed and its Tail appears");
                match_win_1++;
            } else if ((randomNumber == 0) && (playerChoice.equals("tail"))) {
                System.out.println("Coin Tossed and its Heads appears ");
                match_win_1++;
            }
        }
        System.out.println("\tPoints..");

        statusOfGame("\t\t" + player_1_Name + " ", match_win_1);
        statusOfGame("\t\t" + player_2_Name + " ", match_win_2);

        resultOfToss();

    }

    public static void statusOfGame(String name, int status) {
        Player.displayStatus(name, status);
    }

    public static void resultOfToss() {
        if (match_win_1 == 3) {
            Game.winner(player_1_Name);
        } else if (match_win_2 == 3) {
            Game.winner(player_2_Name);

        } else {
            System.out.println("\tChance Left " + (5 - chance));
            chance++;

            System.out.println("\n");
            if (turn == 1) {
                turn = 2;
            } else {
                turn = 1;
            }
            Game.flipCoin();
        }
    }
}
