package programbydoing;
 import java.util.Scanner;
 import java.util.*;
public class HiLoTries {
	public static void main(String [] args) {
		
		Scanner keylock = new Scanner(System.in);
		
		Random r = new Random();
			 
			 int x = 1+r.nextInt(35);
			 int  tries = 1;
			 int guess = 0;
			 
			 System.out.println("I\'m thinking of a number between 1-35. You have 7 guesses.");
			 
			 while(x!= guess && tries<=7) {
				 System.out.println("Guess # "+ (tries++) + ": ");
				 guess = keylock.nextInt();
				 
				 if (x == guess) {
					System.out.println("You guessed it right bruh, what are the odds of that!?");
					break;
				 }	
					else if (x > guess && tries <=7) {
						System.out.println("Your guess is to low, try again.");
				 }	
					else if (x < guess && tries <=7) {
						System.out.println("Youe guess is to high there, try again.");
				 }
					 if (tries >= 7 && x != guess) {
						 System.out.println("Nope you didn\'t guess it in 7 tries. You lost!");
					 }
				 }
			 }
		 }