import java.util.*;

public class NimMarbles
{
	private int marbles;
	public NimMarbles()	
	{
		Random rand = new Random();
		this.marbles = rand.nextInt(91) + 10;
		
	}
	
	void takeMarbles(int m)
	{
		if(m < 1 || m > marbles/2)
			throw new IllegalArgumentException();
		else
			marbles  = marbles - m;
	}
	
	public int getMarbles()
	{
		return marbles;
	}
	
	public String toString()
	{
		return Integer.toString(marbles);
	}
}