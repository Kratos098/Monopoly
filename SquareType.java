import java.awt.*;

public abstract class SquareType extends Button
{
    public String name, tileType;
    public int owner, value; //0 is neutral, 1 for player...

    public SquareType()
    { name = "Water Works"; tileType = "Utility"; owner = 0; value = 0; }

    public SquareType( String name, String tileType, int owner, int value )
    { this.name = name; this.tileType = tileType; this.owner = owner; this.value = value; }

    public String getName() { return name; }

    public void setName( String name ) { this.name = name; }

    public String getTileType() { return tileType; }

    public void getTileType( String tileType ) { this.tileType = tileType; }

    public int getOwner() { return owner; }

    public void setOwner( int owner ) { this.owner = owner; }
}
