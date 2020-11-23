package System;

import Data.Member;
import Data.Player;
import Menu.Menu;
import java.util.Scanner;

public class ism {

    //Attribute
    private static String username;
    private static long password;
    private static long confirmpassword;
    static int stop;
    private static String name;

    //Scanner
    static Scanner nc = new Scanner(System.in);
    static Scanner mc = new Scanner(System.in);

    //Method Register
    public static void Register() {

        //Show rule Register
        Menu.showRegister();

        //Check head and member length
        if (Member.headM < Member.member.length) {

            //loop Register
            while (true) {

                //Input username
                System.out.print("Username : ");
                username = nc.nextLine();
                //Check username are uesd
                for (int i = 0; i < Member.headM; i++) {
                    //If username uesd
                    if (username.equals(Member.member[i].getUsername())) {
                        System.out.println("Username is used");
                        stop = 0;
                        break;
                        //Not uead
                        //stop++ for break this loop (check username are uesd)
                    } else {
                        stop = 1;
                    }

                    //break this loop        
                }
                if (stop == 1) {
                    break;
                }
            }

            //loop register password
            while (true) {
                System.out.print("Password : ");
                password = mc.nextLong();
                System.out.print("Confirm password : ");
                confirmpassword = mc.nextLong();
                //check password equals confirmpassword
                if (password == confirmpassword) {
                    //if equals  = new Array Member
                    Member.member[Member.headM++] = new Member(username, password);
                    System.out.println("Register Success!");
                    break;
                } else {
                    System.out.println("Password not match");
                }
            }
            //If Member is Full
        } else {
            System.out.println("Member is Full!");
        }
    }
    
        //Method Login
    public static void Login() {

        //Loop equals Player
        for (int n = 0; n < Menu.getLoop(); n++) {
            //Attribute for break is Loop(while)
            stop = 0;
            while (true) {
                Menu.showLogin();
                System.out.print("Username : ");
                name = nc.nextLine();
                //Loop check Username 
                for (int i = 0; i < Member.headM; i++) {
                    if (name.equals(Member.member[i].getUsername())) {
                        //if equals Attribute break loop++
                        stop++;
                        //And Input Password 
                        //Loop check password
                        while (true) {
                            System.out.print("Password : ");
                            password = mc.nextLong();

                            //checkpassword
                            if (password == Member.member[i].getPassword()) {
                                //Login and create player in Array player
                                Member.player[Member.headP++] = new Player(Member.member[i].getUsername());
                                break;
                            } else {
                                System.out.println("Password Wrong");
                            }
                        }

                    } else {

                    }
                }
                //break loop Login
                if (stop == 1) {
                    break;
                }
            }
        }
    }
}
