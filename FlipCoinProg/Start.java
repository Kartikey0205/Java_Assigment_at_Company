package FlipCoinProg;

public class Start {

    public static void main(String[] args) {
     System.out.println("Flip Coin Game..");
     System.out.println("Rule for Game is if any player gets 3 points  he wins..");
     Coin.playerInitailize();

     Game.flipCoin();
    }

}
