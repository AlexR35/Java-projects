package programbydoing;
import java.util. Random;
import java.util.Scanner;
public class Oneshothilow {
	public static void main (String [] args) {
		
		Random r = new Random();
	    Scanner key = new Scanner(System.in);
	    
	    int n = 35;
	    int guess =  1 + r.nextInt(100);
	    
	    System.out.println();
	    System.out.println("Im thinking of a number between 1-100. Try to guess it.");
	    System.out.println("> ");
	    guess = key.nextInt();
	    
	    if (guess != n) {
	    	System.out.println("Sorry you are to low. I was thinking of "+n);
	    } 
	    else if (guess == n) {
	    	System.out.println("You guessed it! How did ya know? ");
	    	
	    }
	    
	    
	    
	    
		
		
  }
}