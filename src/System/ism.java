package System;

import Data.Member;
import Data.Player;
import Menu.Menu;
import java.util.Scanner;

public class ism {

    private static String username;
    private static long password;
    private static long confirmpassword;
    static int stop;
    private static String name;

    static Scanner nc = new Scanner(System.in);
    static Scanner mc = new Scanner(System.in);

    /**
     * Method Register -  register is program for play game
     */
    public static void Register() {

        Menu.showRegister();

        if (Member.headM < Member.member.length) {

            while (true) {

                System.out.print("Username : ");
                username = nc.nextLine();

                for (int i = 0; i < Member.headM; i++) {

                    if (username.equals(Member.member[i].getUsername())) {
                        System.out.println("Username is used");
                        stop = 0;
                        break;

                    } else {
                        stop = 1;
                    }
  
                }
                if (stop == 1) {
                    break;
                }
            }

            while (true) {
                System.out.print("Password : ");
                password = mc.nextLong();
                System.out.print("Confirm password : ");
                confirmpassword = mc.nextLong();

                if (password == confirmpassword) {

                    Member.member[Member.headM++] = new Member(username, password);
                    System.out.println("Register Success!");
                    break;
                } else {
                    System.out.println("Password not match");
                }
            }

        } else {
            System.out.println("Member is Full!");
        }
    }
    
    /**
     * Method Login - Login for playing game with p1 , p2  
     */
    public static void Login() {

        for (int n = 0; n < Menu.getLoop(); n++) {

            stop = 0;
            while (true) {
                Menu.showLogin();
                System.out.print("Username : ");
                name = nc.nextLine();

                for (int i = 0; i < Member.headM; i++) {
                    if (name.equals(Member.member[i].getUsername())) {
                        stop++;
                        while (true) {
                            System.out.print("Password : ");
                            password = mc.nextLong();

                            if (password == Member.member[i].getPassword()) {

                                Member.player[Member.headP++] = new Player(Member.member[i].getUsername());
                                break;
                            } else {
                                System.out.println("Password Wrong");
                            }
                        }

                    } else {

                    }
                }

                if (stop == 1) {
                    break;
                }
            }
        }
    }
}
