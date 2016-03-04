import java.util.*;

public class NimHumanPlayer extends NimPlayer
{
    private String nome;
    public NimHumanPlayer(String nome)
    {
        super(nome);
        if(nome == null)
            throw new IllegalArgumentException();
        else
            this.nome = nome;
    }
    
    int move(NimMarbles m)
    {
        int num = m.getMarbles()/2;
        Scanner in = new Scanner(System.in);
        System.out.print("\nInsert how many marbles to remove: ");
        int marblesAmount = in.nextInt();
        
        if(marblesAmount > num)
            throw new IllegalArgumentException();
        else
            return marblesAmount;
    }
    
    public String toString()
    {
        return nome + " - Player";
    }
    
    
    
    
    
    
    
}