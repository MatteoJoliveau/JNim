import java.util.Scanner;

public class JNim
{
	public static void main(String[] args)
	{
		String ver = "0.3.5";
		Scanner in = new Scanner(System.in);
		
        System.out.println("\n--------------------------------------------");
		System.out.println("\nJNim " + ver + " by Matteo Joliveau ©2016");
		System.out.println("\nChoose the GameMode:\n0) Read the rules [COMING SOON] \n1) IA vs IA easy \n2) Player vs IA easy \n3) Player vs Player \n15)Exit ");
		int choice = in.nextInt();
		
		switch(choice)
		{
            case(0):
            {
                //TODO rules
                main(null);
                break;
            }
			case(1):
			{
				iavsiaeasy();
				main(null);
                break;
			}
            
            case(2):
            {
                humvsiaeasy();
                main(null);
                break;
            }
            
            case(3):
            {
                pvp();
                main(null);
                break;
            }
            case(15):
            {
                System.exit(0);
                break;
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
		
		if(game.getNextPlayer()==p1)
			System.out.println("\n" + p1.toString() + " won the game!");
		else
			System.out.println("\n" + p2.toString() + " won the game!");
	}
    
    public static void humvsiaeasy()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("\nInsert your UserName: ");
        String nome = in.next();
        NimHumanPlayer p1 = new NimHumanPlayer(nome);
        NimNonExpertPlayer p2 = new NimNonExpertPlayer("Albert");
        
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
        if(game.getNextPlayer() == p1)
            System.out.println("\n" + p1.toString() + " won the game!");
		else
			System.out.println("\n" + p2.toString() + " won the game!");
    }
    
    public static void pvp()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("\nInsert your UserName ");
        System.out.print("\nPlayer 1: ");
        String nameP1 = in.next();
        System.out.print("\nPlayer 2: ");
        String nameP2 = in.next();
        NimHumanPlayer p1 = new NimHumanPlayer(nameP1);
        NimHumanPlayer p2 = new NimHumanPlayer(nameP2);
        
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
        if(game.getNextPlayer() == p1)
            System.out.println("\n" + p1.toString() + " won the game!");
		else
			System.out.println("\n" + p2.toString() + " won the game!");
    }
}