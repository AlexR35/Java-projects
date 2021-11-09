package programbydoing;
import java.util.Random;
import java.util.Scanner;
public class GuessingCounter {
	public static void main(String [] args) {
		
		//Random r = new Random();
		Scanner keyboard = new Scanner(System.in);
		int count = 0;
		
		System.out.println("I have a chosen number between 1-10. Try to guess it.");
		System.out.println("Your guess: ");
		int guess = keyboard.nextInt();
	
		//int guess = 1 + r.nextInt();
		
		{
		while (guess!= 8) {
			System.out.println("That is incorrect, guess again!");
			System.out.println("Your guess: ");
			guess = keyboard.nextInt();
			count++;
			}
		if(guess == 8) {
			System.out.println("That\'s it, you\'re a great guesser!");
			System.out.println("It only took you " + count + " tries.");
			
		  }
	   }
	}
}
