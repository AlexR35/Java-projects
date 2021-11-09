package programbydoing;
import java.util. Random;
import java.util.Scanner;
public class Dice {
	public static void main(String [] args) {
		
		Scanner key = new Scanner(System.in);
		Random r = new Random();
		
		int roll1 =1+ r.nextInt(6);
		System.out.println("Here Comes The Dice!");
		System.out.println("Roll #1: " );
		System.out.println();
		
		int roll2 =1+ r.nextInt(6);
		System.out.println("Roll #2: "+roll2 );
		System.out.println();
		
		int sum = roll1 + roll2;
		
		System.out.println("The total is! " + sum);
    }
}
