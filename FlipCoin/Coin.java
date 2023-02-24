package FlipCoin;

public class Coin {
public static int randomNumber;
// 0--> head and 1---> tail
    public static void coinTossed() {
           randomNumber = UtilityFunc.generateRandomNumber();
            if ((randomNumber == 0)) {
                System.out.println("\n\tCoin Tossed and its Heads appears");
            } else {
                System.out.println("\n\tCoin Tossed and its Tails appears");
            }

    }

}
