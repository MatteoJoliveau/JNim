import java.util.*;

public class NimExpertPlayer extends NimPlayer
{
	private String nome;
	public NimExpertPlayer(String nome)
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
		int tot = m.getMarbles();
        int moved = tot/2;
        do
        {
            tot = tot - moved;
            moved = moved - 1;
        }while((tot & (tot - 1)) != 0);
		return clamp(moved, 1, (m.getMarbles()/2));
	}

	public static int clamp(int val, int min, int max) 
	{
    return Math.max(min, Math.min(max, val));
	}
	
	public String toString()
	{
		return nome + " - Expert";
	}
}