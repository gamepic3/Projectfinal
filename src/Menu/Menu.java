package Menu;

import Data.Member;
import Game1.GamePlay;
import Game2.GamePlay2;
import System.ism;
import java.util.Scanner;

public class Menu {

    static int loop;
    private static int choice;
    private static int select;

    private static Scanner nc = new Scanner(System.in);

    /**
     * This menu for select number player
     * Tell the number of people who will come to play
     */
    public static void start() {

        Menu.showStart();

        while (true) {

            System.out.print("Select => ");
            choice = nc.nextInt();

            switch (choice) {
                case 1:
                    loop = 1;
                    menu();
                    break;
                case 2:
                    loop = 2;
                    menu();
                    break;
                case 0:
                    break;
            }
            if (choice == 1 || choice == 2 || choice == 0) {
                break;
            }
        }
    }
    
    /**
     * This menu for select
     * Register or Login
     * For registration or login to play the game
     */
    public static void menu() {

        Member.member[0] = new Member("Game", 123);
        Member.member[1] = new Member("Toey", 123);
        Member.member[2] = new Member("Max", 123);

        Menu.showMenu();

        while (true) {

            System.out.print("Select => ");
            select = nc.nextInt();

            switch (select) {
                case 1:

                    ism.Register();
                    menu();
                    break;
                case 2:
                    ism.Login();
                    menuSelectGame();
                    break;
            }
            if (select == 1 || select == 2) {
                break;
            }
        }
    }
    
    /**
     * This menu for select game
     * What game do you want to play?
     */
    public static void menuSelectGame() {
        Menu.showGameSelect();

        while (true) {
            System.out.print("Select => ");
            select = nc.nextInt();
            switch (select) {
                case 1:
                    GamePlay.gameStart();
                    break;
                case 2:
                    GamePlay2.GameStart();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    break;
            }
            if (select == 1 || select == 2 || select == 0) {
                break;
            }
        }
    }

    /**
     *
     * @return Loop
     * For telling the number of players
     */
    public static int getLoop(){
        return loop;
    }

    /**
     * show text for menu start
     */
    public static void showStart() {
        System.out.println(" ---- Player ----");
        System.out.println(" 1 . 1 player ");
        System.out.println(" 2 . 2 player ");
        System.out.println(" 0 . Exit ");
        System.out.println(" ------ * ------");
    }

    /**
     * show text for menu select register or login
     */
    public static void showMenu() {
        System.out.println("");
        System.out.println(" ----- ");
        System.out.println(" 1 . Register ");
        System.out.println(" 2 . Login ");
        System.out.println(" ----- ");
    }

    /**
     * show text for Sign in (register)
     */
    public static void showRegister() {
        System.out.println("");
        System.out.println("SIGN IN ");
    }

    /**
     *show text for Login (login)
     */
    public static void showLogin() {
        System.out.println("");
        System.out.println("LOGIN ");
    }

    /**
     * show text for SnakeLadder Game
     */
    public static void showGameStart() {
        System.out.println("");
        System.out.println("Game Start!");
        for (int i = 0; i < Member.headP; i++) {
            int a = 1;
            System.out.println("P" + a + " is "+ Member.player[i].getName());
            a++;
        }
    }
    
    /**
     * show text for BlackJack Game
     */
    public static void showGameStartBj(){
        System.out.println("");
        System.out.println("Game Start!");
    }

    /**
     * show text for select game 
     */
    public static void showGameSelect() {
        System.out.println("");
        System.out.println(" - - - - - -");
        System.out.println(" Select Game");
        System.out.println(" 1 . Snake Ladder");
        System.out.println(" 2 . Black Jack");
        System.out.println(" 0 . Exit");
        System.out.println(" - - - - - -");
    }
}
