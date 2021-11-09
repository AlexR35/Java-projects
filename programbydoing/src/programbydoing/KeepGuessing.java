package programbydoing;
import java.util.*;
import java.util.Scanner;
public class KeepGuessing {
	public static void main(String [] args) {
	
		Scanner keyboard = new Scanner(System.in);
		Random r = new Random();
		int x = r.nextInt(10);
		System.out.println("I\'m thinking of a number from 1-10.");
		int guess = 0;
		while (guess !=x) {
			
			System.out.println("Your guess: ");
			guess = keyboard.nextInt();
			
			if(guess == x) {
			System.out.println("That is correct, you\'re a clever guesser!");			
		}else{
			System.out.println("Incorrect, plz try again!");
			
		
		 }
	  }
   }
}