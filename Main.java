import java.util.*;

public class Main
{

    public static Square[] board = new Square[28];
    private static Dice d1;
    public static Pieces p1, p2; public static int p1Money, p2Money;
    private Square property;
    public static Scanner s = new Scanner( System.in );

    public static void main(String[] args)
    {
        board[0] = new Square( "Med Ave: $060", "property", true, 060 );
        board[1] = new Square( "Ori Ave: $100", "property", true, 100 );
        board[2] = new Square( "Con Ave: $120", "property", true, 120 );
        board[3] = new Square( "Chance", "chance", false, 0 );
        board[4] = new Square( "Read Rail: $200", "property", true, 200 );
        board[5] = new Square( "Cha Pla: $140", "property", true, 140 );
        board[6] = new Square( "Jail", "jail", false, 0 );
        board[7] = new Square( "Sta Ave: $140", "property", true, 140 );
        board[8] = new Square( "Vir Ave: $160", "property", true, 160 );
        board[9] = new Square( "Penn Rail: $200", "property", true, 200 );
        board[10] = new Square( "Chance", "chance", false, 0 );
        board[11] = new Square( "Jam Pla: $180", "property", true, 180 );
        board[12] = new Square( "Ten Ave: $180", "property", true, 180 );
        board[13] = new Square( "Free Parking!", "free parking", false, 0 );
        board[14] = new Square( "New Ave: $200", "property", true, 200 );
        board[15] = new Square( "Ken Ave: $220", "property", true, 220 );
        board[16] = new Square( "Band Rail: $200", "railroad", true, 200 );
        board[17] = new Square( "Chance", "chance", false, 0 );;
        board[18] = new Square( "Elec Comp: $150", "utility", true, 150 );
        board[19] = new Square( "Lux Tax", "lux tax", false, 250);
        board[20] = new Square( "Jail", "jail", false, 0 );
        board[21] = new Square( "Ind Ave: $240", "property", true, 240 );
        board[22] = new Square( "Ill Ave: $240", "property", true, 240 );
        board[23] = new Square( "Chance", "chance", false, 0 );
        board[24] = new Square( "Shor Rail: $200", "railroad", true, 200 );
        board[25] = new Square( "Atl Ave: $260", "property", true, 260 );
        board[26] = new Square( "Ven Ave: $260", "property", true, 260 );
        board[27] = new Square( "GO!", "property", false, 60 );
    }
}