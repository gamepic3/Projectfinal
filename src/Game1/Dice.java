package Game1;

public class Dice {

    //Attribute
    private static final int MAX = 6;
    static int faceValue;

    //Medhot roll
    public static void roll() {
        faceValue = (int) (Math.random() * MAX) + 1;
    }

    //GetFaceDice
    public int getFaceValue() {
        return faceValue;
    }
}
