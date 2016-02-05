import java.util.*;
public abstract class NimPlayer
{
	private String nome;
	public NimPlayer(String nome)
	{
		if(nome == null)
			throw new IllegalArgumentException();
		else
			this.nome = nome;
	}

	abstract int move(NimMarbles m);
	
	public String getName()
	{
		return nome;
	}
	
	public String toString()
	{
		return "Player name: " + nome;
	}
} 
