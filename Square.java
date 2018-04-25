import java.awt.*;

public class Square extends SquareType
{
    public boolean own; public Pieces p1, p2;

    public Square( String name, String tileType, boolean own, int value)
    { this.name = name; this.tileType = tileType; this.own = own; this.value = value; }

    public boolean canOwn() { return own; }

    public int getValue() { return value; }

    public void setValue( int value ) { this.value = value; }

    public void buy( int owner )
    {
        if( own && this.owner == 0 )
        {
            if( owner == 1 )
            {
                if( Main.p1.money >= value )
                {
                    Main.p1.money -= value;
                    super.owner = owner;
                }
            }
        }
    }

    public void sell()
    {
        if( owner == 1 )
        { Main.p1Money += value; }

        else if( owner == 2 )
        { Main.p1Money += value; }

        super.owner = 0;
    }

    public String getName1()
    {
        if( p1 != null )
        { return p1.getName(); }

        else { return " "; }
    }

    public String getName2()
    {
        if( p2 != null )
        { return p2.getName(); }

        else{ return " "; }
    }

    public boolean isOwned() { return owner != 0; }

    public void setp1Piece( Pieces p ) { p1 = p; } public void setp2Piece( Pieces p ) { p2 = p; }

}
