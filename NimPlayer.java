public abstract class NimPlayer
{
	private String nome;
	public NimPlayer(String nome)
	{
		if(nome == null)
			throw IllegalArgumentException;
		else
			this.nome = nome;
	}

	int move(NimMarbles m)
	{
		
	}
	
	public String toString()
	{
		return "Player name: " + nome;
	}
} 
