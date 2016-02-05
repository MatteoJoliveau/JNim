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
		if(!isGameOver())
		{
			currentPlayer = nextPlayer;
			int marbleRemoved = currentPlayer.move(marbleStack);
			marbleStack.takeMarbles(marbleRemoved);
			nextPlayer = updatePlayer();
			return marbleRemoved;
		}
		else if(nextPlayer == player2)
				return 101;
			 else	
			 	return 102;
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
	
	public String toString()
	{				
		return "\nMarbles: " + Integer.toString(marbleStack.getMarbles()) 
		+ "\nNext to play: " + nextPlayer.toString();
	}
}