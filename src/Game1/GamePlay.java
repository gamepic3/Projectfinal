package Game1;


import Menu.Menu;
import java.util.Scanner;

public class GamePlay {

    static Scanner nc = new Scanner(System.in);
    static int currentp1;
    static int currentp2;

    public static void gameStart() {
        
        currentp1 =0;
        currentp2 =0;
        
        Menu.showGameStart();
        System.out.println("Distance : 50");
        while (true) {
            System.out.println("");
            System.out.println("P1 Round!");
            System.out.println("Press Enter (Roll Dice)");
            nc.nextLine();
            Dice.roll();
            currentp1 += Dice.faceValue;
            if (currentp1 >= 50) {
                currentp1 = 50;
            }
            Game1.Rule.RuleP1();
            System.out.println("P1 : " + " At " + currentp1);
            if (currentp1 >= 50) {
                break;
            }
            System.out.println("");
            System.out.println("P2 Round!");
            System.out.println("Press Enter (Roll Dice)");
            nc.nextLine();
            Dice.roll();
            currentp2 += Dice.faceValue;
            if (currentp2 >= 50) {
                currentp1 = 50;
            }
            Game1.Rule.RuleP2();
            System.out.println("P2 : " + "At " + currentp2);
            if (currentp2 >= 50) {
                break;
            }
        }
        if (currentp1 > currentp2) {
            System.out.println("Winner is P1");
        } else {
            System.out.println("Winner is P2");
        }
        String choice;
        while(true){
        System.out.println("Do you want to play again? Y/N");
        choice = nc.nextLine();
        if("Y".equals(choice) || "y".equals(choice)){
            gameStart();
            break;
        }else if("N".equals(choice) || "n".equals(choice)){
            Menu.menuSelectGame();
            break;
        }else{
            System.out.println("Please select again!");
        }
        }
    }

}
