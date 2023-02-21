package FlipCoinProg;

public class Game {
    // 0 == Head
    // 1 == Tail

    public static void flipCoin() {
        Coin.coinTossed();
    }

    public static void winner(String name) {
        System.out.println(name + " wins the match");
    }

}
