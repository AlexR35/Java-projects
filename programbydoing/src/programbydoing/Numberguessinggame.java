package programbydoing;
import java.util.Random;
import java.util.Scanner;

public class Numberguessinggame {
		   		public static void main(String[] args){
		
		Scanner key = new Scanner(System.in);
		Random r = new Random();
		int n = 5;
		int x = r.nextInt(10);
		
		System.out.println("I'm thinking of a number from 1 to 10.");
		System.out.println("Your guess:  ");
		int guess = key.nextInt();
		
		if (guess != 5) {
		System.out.println("Sorry, but I was really thinking of  " + n);
		
		}else if (guess == 5) {
			  System.out.println ("Thats right! My secret number was " +n + "!");
		}
  }
}