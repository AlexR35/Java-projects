package programbydoing;
import java.util.Scanner;
import java.util.Random;
public class strdoubledice {

	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
		Random rn = new Random();
		
		System.out.print("HERE COME THE DICE!");
		System.out.println("");
		//int num = 0;
		//int sum = num + sum;
			
		int roll1;
		int roll2;
		
		do {
		roll1 = 1+rn.nextInt(6);
		roll2 = 1+rn.nextInt(6);
	
		System.out.println("Roll #1: " + roll1);
		System.out.println("Roll #2: " + roll2);
		int sum = roll1+roll2;
		
		System.out.println("The total is " + sum + "!");	
		System.out.println();
		
		}while(roll1 != roll2);	
		{
     }
   }
}