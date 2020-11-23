package Game1;

public class Rule {

    /**
     * Rule in game snake ladder
     * for p1 and p2
     */
    public static void RuleP1() {
        switch (GamePlay.currentp1) {
            case 3:
                GamePlay.currentp1 = 24;
                System.out.println("Congratulation");
                break;
            case 4:
                GamePlay.currentp1 = 15;
                System.out.println("Congratulation");
                break;
            case 20:
                GamePlay.currentp1 = 9;
                System.out.println("Oops!");
                break;
            case 26:
                GamePlay.currentp1 = 43;
                System.out.println("Congratulation");
                break;
            case 29:
                GamePlay.currentp1 = 40;
                System.out.println("Congratulation");
                break;
            case 34:
                GamePlay.currentp1 = 19;
                System.out.println("Oops!");
                break;
            case 46:
                GamePlay.currentp1 = 37;
                System.out.println("Oops!");
                break;
            case 49:
                GamePlay.currentp1 = 28;
                System.out.println("Oops!");
                break;
            default:
                break;
        }
    }
    
    public static void RuleP2(){
        switch (GamePlay.currentp2) {
            case 3:
                GamePlay.currentp2 = 24;
                System.out.println("Congratulation");
                break;
            case 4:
                GamePlay.currentp2 = 15;
                System.out.println("Congratulation");
                break;
            case 20:
                GamePlay.currentp2 = 9;
                System.out.println("Oops!");
                break;
            case 26:
                GamePlay.currentp2 = 43;
                System.out.println("Congratulation");
                break;
            case 29:
                GamePlay.currentp2 = 40;
                System.out.println("Congratulation");
                break;
            case 34:
                GamePlay.currentp2 = 19;
                System.out.println("Oops!");
                break;
            case 46:
                GamePlay.currentp2 = 37;
                System.out.println("Oops!");
                break;
            case 49:
                GamePlay.currentp2 = 28;
                System.out.println("Oops!");
                break;
            default:
                break;
        }
    }
}
