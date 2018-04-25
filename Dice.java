public class Dice
{
    private static int value;

    public Dice() { value = (int) ( Math.random() * 6.0 ) + 1; }

    public static int getValue() { return value; }
}
