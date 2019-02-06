import java.util.*;
/**
 * Write a description of class Main here.
 *
 * @author Kyle Carter
 * @version 1.0
 */
public class Main
{
    // instance variables
    private int x;
    private List<Integer> guesses;

    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        x = generateNum();
        guesses = new ArrayList<Integer>();
        startGame(x, guesses);
    }

    /**
     * Generates random number between 1 and 100
     *
     * @param
     * @return    random integer between 1 and 100
     */
    public int generateNum()
    {
        Random rand = new Random();
        int num = rand.nextInt(99)+1;
        return num;
    }
    
    /**
     * Starts the game.
     */
    public void startGame(int x, List<Integer> guesses)
    {
        Scanner sc = new Scanner(System.in);
        int guess;
        int count = 0;
        
        System.out.println("Lets Play a GAME!\n");
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("What is it?");
       
        guess = sc.nextInt();
        guesses.add(guess);
        count++;
        
        while(guess != x)
        {
            if(guess > x)
            {
                System.out.println("Nope! Too big, try again");
            }
            else
            {
                System.out.println("Aww, thats too small! try again");
            }
            guess = sc.nextInt();
            
            if(!(guesses.contains(guess)))
            {
                count++;
            }
            guesses.add(guess);
        }
        
        System.out.println("You got it!");
        System.out.printf("%d is the corret number, it took you %d try(s) to get it!\n", x, count);
 
    }
    
}
