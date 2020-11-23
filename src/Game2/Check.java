package Game2;

public class Check {
    

    static int scorep1 = 21 - GamePlay2.currentp1;
    static int scorep2 = 21 - GamePlay2.currentp2;

    /**
     * check score for blackjack game
     */
    public static void check() {
        if (GamePlay2.currentp1 > 21 && GamePlay2.currentp2 > 21) {
            System.out.println("Lose All");
        } else if (GamePlay2.currentp1 == 21 && GamePlay2.currentp2 == 21) {
            System.out.println("D");
        } else if (GamePlay2.currentp1 == 21) {
            System.out.println("P1 win");
        } else if (GamePlay2.currentp2 == 21) {
            System.out.println("P2 win");
        } else if (GamePlay2.currentp1 > 21 && GamePlay2.currentp2 < 21) {
            System.out.println("P2 win");
        } else if (GamePlay2.currentp1 < 21 && GamePlay2.currentp2 > 21) {
            System.out.println("P1 win");
        } else if (scorep1 < scorep2) {
            System.out.println("P1 win");
        } else {
            System.out.println("P2 win");
        }
    }
}
