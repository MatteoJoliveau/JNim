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
		return rand.nextInt(m.getMarbles() - 1) + 1;
	}
	
	public String toString()
	{
		return nome + " - Non Expert";
	}
}