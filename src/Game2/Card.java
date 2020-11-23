package Game2;

public class Card {

    private static final int MAX = 13;
    static int currentScore;

    /** 
     * draw card
     */

    public static void draw() {
        currentScore = (int) (Math.random() * MAX) + 1;
    }

    /**
     *
     * @return currentScore
     */
    public int getCurrentScore() {
        return currentScore;
    }
}
