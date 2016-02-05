import java.util.Scanner;

public class JNim
{
	public static void main(String[] args)
	{
		String ver = "0.1";
		Scanner in = new Scanner(System.in);
		
		System.out.println("\nJNim " + ver + " by Matteo Joliveau ©2016");
		System.out.println("\nChoose the GameMode:\n1) IA vs IA easy");
		int choice = in.nextInt();
		
		switch(choice)
		{
			case(1):
			{
				iavsiaeasy();
				main(null);
			}
		}
		//iavsiaeasy(); //debug
	}
	
	public static void iavsiaeasy()
	{
		NimNonExpertPlayer p1 = new NimNonExpertPlayer("Mary");
		NimNonExpertPlayer p2 = new NimNonExpertPlayer("John");
		NimGame game = new NimGame(p1, p2);
		game.setPlayer1(p1);
		game.setPlayer2(p2);
		int gameState = 0;
		
		while(!game.isGameOver())
		{
			System.out.println(game.toString());
			gameState = game.executeMove();
			if(gameState == 101 || gameState == 102)
				break;
			else
				System.out.println("Removed " + gameState + " marbles");
				
			try 
			{
    			Thread.sleep(1000);
  			} catch(InterruptedException ex) 
			  {
			  	Thread.currentThread().interrupt();
			  }
		}
		
		if(gameState == 102)
			System.out.println("\n" + p1.toString() + " won the game!");
		else
			System.out.println("\n" + p2.toString() + " won the game!");
	}
}