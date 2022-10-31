import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.*;


public class GoFish
{
    public static void main(String[] args) throws IOException
    {
        Scanner in = new Scanner(new File("gofish.dat"));
        String[] first = new String[7]; //declaring arrays to hold my "cards"
        String[] second = new String[7];
        String firstStr = in.nextLine();
        Scanner parseFirst = new Scanner(firstStr);
        for(int i = 0; i<7; i++)
        {
            first[i]=parseFirst.next(); //put each letter/number into my "decks"
        }
        String secondStr = in.nextLine();
        Scanner parseSecond = new Scanner(secondStr);
        for(int i = 0; i<7; i++)
        {
            second[i]=parseSecond.next();
        }
        boolean fish = true;
        for(int i = 0; i<10; i++)
        {
            String card = in.next();
            if(i%2==0) //checks who turn it is
            {
                for(int j = 0; j<7; j++)
                {
                    if(card.equals(second[j])) //if card is found in deck, show it
                    {
                        fish = false;
                        break;
                    }
                    
                    
                }
            }
            else
            {
                for(int j = 0; j<7; j++)
                {
                    if(card.equals(first[j]))
                    {
                        fish = false;
                        break;
                    }
                    
                    
                }
            }
            String output = fish? "GO FISH" : "HERE'S MY CARD"; //sets output based on if card was found
            fish=true;
            System.out.println(output);
            
        }
       
    }
}