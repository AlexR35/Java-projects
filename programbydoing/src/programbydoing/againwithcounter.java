package programbydoing;
import java.util.Scanner;
import java.util.Random;
public class againwithcounter {
	public static void main (String [] args) {
		
		Scanner entry = new Scanner(System.in);
		Random r = new Random();
		int actual = 1+r.nextInt(10);
		
		int guess;
		
		
		System.out.println("I have chosen a number between 1-10. Try to guess it.");
		int tries = 1;
		System.out.println("Your guess is : ");
	    guess = entry.nextInt();
	    
		do {
			
	     if(guess!= actual) {
	   
	    System.out.println("That\'s incorrect. Guess again.");
	    System.out.println("Your guess is: ");
	    guess = entry.nextInt();
	    System.out.println();
	    tries++;
	   }  
		}while
		   (guess != actual); 
		System.out.println("You\'re a good guesser!");
		System.out.println("It only took you "+ tries + " tries.");
	    }
		
	}

