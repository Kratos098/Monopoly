import java.util.*;
public class Chance
{
    public static String chance1 = "Collect $200! Bonne Chance!";
    public static String chance2 = "Collect $100! Bonne Chance!";
    public static String chance3 = "You lose $150! Too bad!";
    public static String chance4 = "You lose $100! Too bad!";
    public static String getOutOfJail = "Get out of jail free!";

    public static String[] cardPile = { chance1, chance2, chance3, chance4, getOutOfJail };

    public static int returnIndex( String chance ) { return Arrays.asList( cardPile ).indexOf( chance ); }

    public static String getCard() { return cardPile[(int) (Math.random() * 5.0 ) + 1];  }
}
