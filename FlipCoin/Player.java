package FlipCoin;


public class Player {

    public static String playerName;
    Player(String name ,int index) {
        this.playerName = name;
        Game.totalPlayerList.add(index,name);
        Game.playerScore.add(index, 0);
        Game.playerChoice.add(index,null);
    }

    public static void displayChoice(int index) {
            System.out.println("\n"+Game.totalPlayerList.get(index) + " has opted " + Game.playerChoice.get(index));
    }

    public static boolean updatePoints(int index,int randomNumb) {
        if (randomNumb == 0) {
            // if 0 that means head
            // so find all player Choice who opt head
                int getPoints = Game.playerScore.get(index);
                if (Game.playerChoice.get(index).equalsIgnoreCase("HEAD")||Game.playerChoice.get(index).equalsIgnoreCase("h")||Game.playerChoice.get(index).equalsIgnoreCase("HEADS")) {
                    Game.playerScore.set(index, ++getPoints);
                    return true;
                }
        } else {
                int getPoints = Game.playerScore.get(index);
                if (Game.playerChoice.get(index).equalsIgnoreCase("TAIL")||Game.playerChoice.get(index).equalsIgnoreCase("T")||Game.playerChoice.get(index).equalsIgnoreCase("TAILS")) {
                    Game.playerScore.set(index, ++getPoints);
                    return true;

                }
        }
        return false;
    }

   
}
