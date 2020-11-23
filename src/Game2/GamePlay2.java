package Game2;


import Data.Member;
import java.util.Scanner;
import Menu.Menu;
public class GamePlay2 {

    static Scanner nc = new Scanner(System.in);
    
    static int currentp1;
    static int currentp2;
    static String select;

    /**
     * GamePlay used card in class Card
     * Game Name : Black Jack
     */
    public static void GameStart() {
        
        if (Menu.getLoop() == 2) {
            
            Menu.showGameStartBj();
            
            
            System.out.println("P1 is " + Member.player[0].getName());
            System.out.println("P2 is " + Member.player[1].getName());
            System.out.println("P1 round");
            while (true) {
                System.out.print("Y/N : ");
                select = nc.nextLine();
                switch (select) {
                    case "Y":
                        Card.draw();
                        currentp1 += Card.currentScore;
                        System.out.println(currentp1);
                        break;
                    case "N":
                        break;
                }
                if ("N".equals(select)) {
                    break;
                }
            }
            System.out.println("P2 round");
            while (true) {
                System.out.print("Y/N : ");
                select = nc.nextLine();
                switch (select) {
                    case "Y":
                        Card.draw();
                        currentp2 += Card.currentScore;
                        System.out.println(currentp2);
                        break;
                    case "N":
                        break;
                }
                if ("N".equals(select)) {
                    break;
                }
            }
            Check.check();
        } else {
            System.out.println("Player not enough");
        }
        String choice;
        while(true){
        System.out.println("Do you want to play again? Y/N");
        choice = nc.nextLine();
        if("Y".equals(choice) || "y".equals(choice)){
            GameStart();
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
