package Menu;

import Data.Member;
import Game1.GamePlay;
import Game2.GamePlay2;
import System.ism;
import java.util.Scanner;

public class Menu {

    //Attribute
    static int loop;
    private static int choice;
    private static int select;
    //Scanner
    private static Scanner nc = new Scanner(System.in);

    //Method Start Menu(Select Number Player)
    public static void start() {

        //Display Menu (Select Number Player)
        Menu.showStart();

        //select
        while (true) {
            //Input choice
            System.out.print("Select => ");
            choice = nc.nextInt();

            //switch case
            switch (choice) {
                case 1:
                    //player = loop
                    loop = 1;
                    menu();
                    break;
                case 2:
                    //player = loop
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
        //getLoop for loop in other class
    }
    
    public static void menu() {

        //Default Member
        Member.member[0] = new Member("Game", 123);
        Member.member[1] = new Member("Toey", 123);
        Member.member[2] = new Member("Max", 123);

        //Display Menu (Select Register or Login)
        Menu.showMenu();

        while (true) {

            //Input choice
            System.out.print("Select => ");
            select = nc.nextInt();

            //switch case
            switch (select) {
                case 1:
                    //Register medhot
                    ism.Register();
                    menu();
                    break;
                case 2:
                    //Login medhot
                    ism.Login();
                    menuSelectGame();
                    break;
            }
            if (select == 1 || select == 2) {
                break;
            }
        }
    }
    
    public static void menuSelectGame() {
        //Display Menu (Select Game)
        Menu.showGameSelect();

        //select
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
    public static int getLoop(){
        return loop;
    }
    
    //Display
     //Display Start
    public static void showStart() {
        System.out.println(" ---- Player ----");
        System.out.println(" 1 . 1 player ");
        System.out.println(" 2 . 2 player ");
        System.out.println(" 0 . Exit ");
        System.out.println(" ------ * ------");
    }

    //Display MenuRegister/Login
    public static void showMenu() {
        System.out.println("");
        System.out.println(" ----- ");
        System.out.println(" 1 . Register ");
        System.out.println(" 2 . Login ");
        System.out.println(" ----- ");
    }

    //Display Register
    public static void showRegister() {
        System.out.println("");
        System.out.println("SIGN IN ");
    }

    //Display Login
    public static void showLogin() {
        System.out.println("");
        System.out.println("LOGIN ");
    }

    //Display GameStart
    public static void showGameStart() {
        System.out.println("");
        System.out.println("Game Start!");
        for (int i = 0; i < Member.headP; i++) {
            System.out.println("P1 is " + Member.player[i].getName());
        }
    }
    
    public static void showGameStartBj(){
        System.out.println("");
        System.out.println("Game Start!");
    }

    //Display Select Game
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
