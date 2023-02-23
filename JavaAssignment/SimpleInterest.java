package JavaAssignment;

import java.util.Scanner;

public class SimpleInterest {
    public static double simpleInterestResult;

    // menu class
    public static void menu() {
        System.out.println("1 for Simple Interest...");
        GetUserInput.sc = new Scanner(System.in);
        switch (GetUserInput.sc.nextInt()) {
            case 1:
                calculatingSimpleInterest();
                break;

            default:
                System.out.println("Please enter valid input");
                break;
        }

    }

    // Getting principle Method
    public static double getPrinciple(){
        double principleAmount = GetUserInput.getDouble("Enter principle amount");
        return principleAmount;
    }

    // Getting Rate Method
      public static double getRate(){
        double rateAmount = GetUserInput.getDouble("Enter Rate ");
        return rateAmount;
    }

    // Getting Time Method
    public static double getTime(){
        double time = GetUserInput.getDouble("Enter Time ");
        return time;
    }

    // multiply Principle rate time
    public static double multiplyPRT(double principle , double rate , double time){
        return (principle * rate * time);
    }

    // calculation method
    public static void calculatingSimpleInterest() {
        double principle = getPrinciple();
        double rate = getRate();
        double time = getTime();

        double result = multiplyPRT(principle, rate , time) / Constants.divideByHundred;
        displaySimpleInterest(result);
    }

    // display method
    public static void displaySimpleInterest(double result) {
            System.out.println("Simple Interest is " + result);
    }
    

    // Main method
    public static void main(String[] args) {
        menu();
    }
}
