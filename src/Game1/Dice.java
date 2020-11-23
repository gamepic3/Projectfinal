package Game1;

public class Dice {


    private static final int MAX = 6;
    static int faceValue;

    /**
     * roll dice
     */
    public static void roll() {
        faceValue = (int) (Math.random() * MAX) + 1;
    }

    /**
     *
     * @return face value
     */
    public int getFaceValue() {
        return faceValue;
    }
}
