package programbydoing;
import java.util.Scanner;
import java.util.Random;
public class FlipAgain {
	public static void main(String [] args) {
		
		Scanner keyboard = new Scanner(System.in);
		Random rn = new Random();
		
		String again;
		String coin = "";
		
		
		do {
			int flip = rn.nextInt(2);
			if(flip == 1)
				coin = "HEADS";
			else
				coin = "TAILS";
			
		System.out.println("You flip a coin and it is..." + coin);
		System.out.println("Would you like to flip again (y/n)");
		again = keyboard.next();
		}while(again.equals("y"));
	 }
}
