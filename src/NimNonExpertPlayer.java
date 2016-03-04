import java.util.*;

public class NimNonExpertPlayer extends NimPlayer
{
	private String nome;
	public NimNonExpertPlayer(String nome)
	{
		super(nome);
		if(nome == null)
			throw new IllegalArgumentException();
		else
			this.nome = nome;
	}
	
	int move(NimMarbles m)
	{
		Random rand = new Random();
		int num = m.getMarbles()/2;
		//System.out.println(num); //debug
		return clamp(rand.nextInt(num + 1), 1, num);
	}

	public static int clamp(int val, int min, int max) 
	{
    return Math.max(min, Math.min(max, val));
	}
	
	public String toString()
	{
		return nome + " - Non Expert";
	}
}