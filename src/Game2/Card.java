package Game2;

public class Card {

    //Attribute
    private static final int MAX = 13;
    static int currentScore;

    //Medhot Draw
    public static void draw() {
        currentScore = (int) (Math.random() * MAX) + 1;
    }

    //GetCurrentScore
    public int getCurrentScore() {
        return currentScore;
    }
}
