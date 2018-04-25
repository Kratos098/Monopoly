import java.util.*;

public class Pieces implements Piece
{
    public String owner; public ArrayList<String> cards;
    public int ind = 0, turns = 0, skippedTurns = 0, rOwner = 0, money = 0, num = 0;
    public boolean moved = false, inJail = false;

    Pieces() { owner = "Mani"; cards = new ArrayList<String>(); }

    public int getInd() { return ind; }
    public void setInd( int ind ) { this.ind = ind; }

    public String getName() { return owner; }
    public void setOwner( String owner) { this.owner = owner; }


    public void move( int space )
    {
        if( ( ind + space ) + space > 27 )
        {
            int spaces = ind; ind += space - 27; money += 200;

            if( num == 1 )
            { Main.board[ind].setp1Piece( this ); Main.board[spaces].setp1Piece( null ); }

            else
            { Main.board[ind].setp2Piece( this ); Main.board[spaces].setp2Piece( null ); }

            this.mortgage();
        }

        else
        {
            int spaces = ind; ind += spaces;

            if( num == 1 )
            { Main.board[ind].setp1Piece( this ); Main.board[spaces].setp1Piece( null ); }

            else { Main.board[ind].setp2Piece( this ); Main.board[spaces].setp2Piece( null ); }
        }

        if( space > 0 ){ moved = true; }
    }

    public void addTurn() { this.turns++; }
    public int getTurn() { return this.turns; }

    public Square getSquare(){ return Main.board[this.ind]; }

    public void addSkippedTurn( int skip ) { this.skippedTurns = skip; }
    public int getSkippedTurn(){ return this.skippedTurns; }
    public boolean movable() { return this.skippedTurns == 0; }

    public int getROwner(){ return this.rOwner; }
    public void setrOwner( int own ) { this.rOwner = own; }


    public void rent()
    {
        if( Main.board[this.ind].getValue() > 0 && this.moved )
        {
            System.out.println( "You will pay " + Main.board[this.ind].getValue() + " for landing on " + Main.board[this.ind].getName() + "." );
            this.moved = false;
        }
    }

    public void drawChanceCard()
    {
        String chance = Chance.getCard();
        cards.add( chance );
        System.out.println( "From the chance card pile, you have chanced upon a card and must " + chance );
        if( chance.equals( Chance.chance1 ) )
        { this.money += 200; cards.remove( Chance.chance1 ); System.out.println( "Congrats! $200 has been added to your account!" ); }
        if( chance.equals( Chance.chance2 ) )
        { this.money += 100; cards.remove( Chance.chance2 ); System.out.println( "Congrats! $100 has been added to your account!" ); }
        if( chance.equals( Chance.chance3 ) )
        { this.money -= 150; cards.remove( Chance.chance3 ); System.out.println( "Too bad! $150 has been deducted from your account!" ); }
        if( chance.equals( Chance.chance4 ) )
        { this.money -= 200; cards.remove( Chance.chance4 ); System.out.println( "Too bad! $100 has been deducted from your account!" ); }
    }

    public boolean checkChance( String chance ) { return cards.contains( chance ); }
    public void playChance( String chance ) { cards.remove( chance ); }

    public void charge( int value )
    {
        if( ( this.money - value ) < 0 )
        { this.money = 0; }
        else
             this.money -= value;
    }

    public void mortgage()
    {
        for( Square x : Main.board )
        { if( x.getOwner() == num ) { charge( x.getValue() ); } }
    }





}
