package JavaAssignment;

import java.util.Random;

public class UtilityFunc {

    // Random number
    public static int generateRandomNumber() {
        Random r = new Random();
        return (r.nextInt(Constants.boundation));
    }

    // checking player NUMBER VALIDITY
    public static boolean minNumber(int playerCount) {
        if (playerCount <= 1) {
            return false;
        }
        return true;
    }
}
