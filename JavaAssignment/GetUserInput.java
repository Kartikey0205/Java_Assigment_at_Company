package JavaAssignment;

import java.util.Scanner;

// static k andr nonstatic can't call
// for direct access always make static

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
            return getInt("Enter valid input");
        }

    }
    // Character Method
    public void getChar(String msg) {
        System.out.println(msg);
        sc = new Scanner(System.in);

        attempt++;
        try {

            String charInput = sc.next();
            if (charInput.length() == 1) {
                System.out.println("You entered " + charInput);

            } else {
                validity(attempt);
                getChar("Enter the character ...");

            }

        } catch (Exception e) {
            validity(attempt);
            getChar("Enter the character ...");
        }
    }


    // double method
    public static double getDouble(String msg) {
        System.out.println(msg);
        sc = new Scanner(System.in);

        attempt++;
        try {
            double doubleInput = sc.nextDouble();
            System.out.println("You entered " + doubleInput);
            return doubleInput;
        } catch (Exception e) {
            validity(attempt);
            return getDouble("Enter the Double ...");
        }
        

    }

    // long method


    
    public static void main(String[] args) {
        GetUserInput getInput = new GetUserInput();
        // getInput.getString("Enter your String...");
        // getInt("Enter the integer..");
        // getInput.getChar("Enter the character..");
        double doubleResult =  getInput.getDouble("Enter the Double..");

        // getInput.getLong("Enter the Long..");


    }
}
