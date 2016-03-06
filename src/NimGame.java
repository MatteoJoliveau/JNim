import java.util.Random;

public class NimGame
{
	private NimPlayer player1, player2, currentPlayer, nextPlayer;
	private NimMarbles marbleStack;
	
	public NimGame(NimPlayer p1, NimPlayer p2)
	{
		this.marbleStack = new NimMarbles();
		Random rand = new Random();
		if(rand.nextBoolean())
		{
			this.nextPlayer = p1;
			//System.out.println(nextPlayer); //debug
		}
		else 
		{
			this.nextPlayer = p2;
			//System.out.println(nextPlayer); //debug
		}	
	}
	
	public boolean isGameOver()
	{
		if(marbleStack.getMarbles() == 1)
			return true;
		else	
			return false;
	}
	
	public int executeMove()
	{
	
        currentPlayer = nextPlayer;
        boolean loop = false;
        int marbleRemoved = 0;
        
        do
        {
            try
            {   
                loop = false;
                marbleRemoved = currentPlayer.move(marbleStack);
            }catch(IllegalArgumentException ex)
            {
                System.out.println("You can't remove that many marbles!");
                loop = true;
            }
        }while(loop);
        
        marbleStack.takeMarbles(marbleRemoved);
        nextPlayer = updatePlayer();
        return marbleRemoved;
		
	}
	
	public NimPlayer updatePlayer()
	{
		if(currentPlayer == player1)
			return player2;
		else
			return player1;
	}
	
	public void setPlayer1(NimPlayer p)
	{
		player1 = p;
	}
	
	public void setPlayer2(NimPlayer p)
	{
		player2 = p;
	}
    
    public NimPlayer getCurrentPlayer()
    {
        return currentPlayer;
    }
    
    public NimPlayer getNextPlayer()
    {
        return nextPlayer;
    }
	
	public String toString()
	{				
		return "\nMarbles: " + Integer.toString(marbleStack.getMarbles()) 
		+ "\nNext to play: " + nextPlayer.toString();
	}
}