package FlipCoinProg;


import java.util.Scanner;

public class GetUserInput {
    public static int attempt = 0;
    public static Scanner sc;

    // checking validity of Type of input

    public static void validity(int chance) {
        if (chance >= 3) {
            System.out.println("Oooppss you exceed limit...");
            System.exit(0);
        } else {
            System.out.println("Next chance\n");
        }
    }

    // String Method
    public static String getString(String msg) {
        System.out.println(msg);

        sc = new Scanner(System.in);
        attempt++;
        String stringInput = sc.next();
        try {
            return stringInput;
        } catch (Exception e) {
            validity(attempt);
            return getString("Choose head or Tail please");
        }

    }

    // Integer Method
    public static int getInt(String msg) {
        System.out.println(msg);
        sc = new Scanner(System.in);
        Integer inputiInteger = sc.nextInt();
        attempt++;
        try {
            return inputiInteger;
        } catch (Exception e) {
            validity(attempt);
            return getInt("Enter your Age");
        }

    }
}
