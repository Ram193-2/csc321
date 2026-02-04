// Ram Tanala CSC 321-40
import java.util.Scanner;

public class rtanala4
{
    public static void main(String[] args)
    {
       System.out.println("Select one of the four options:");
       System.out.println("1) Sandwich");
       System.out.println("2) Taco");
       System.out.println("3) Burrito");
       System.out.println("4) Burger");

       Scanner scnr = new Scanner(System.in);	
       int userInput = scnr.nextInt();

       if(userInput == 1)
       {
	       System.out.println("You got a sandwich!");
       }
       else if (userInput == 2)
       {
               System.out.println("You got a taco!");
       }
       else if (userInput == 3)
       {
               System.out.println("You got a burrito!");
       }
       else
       {
	       System.out.println("You get a burger!");
       }
    }
}

