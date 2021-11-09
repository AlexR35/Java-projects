package programbydoing;
import java.util.Scanner;
public class AddingValuesLoop {
	public static void main(String [] args) {
		
		Scanner keyhead = new Scanner(System.in);
		
		int num = 0;
		int sum = 0;
		System.out.println("Number: ");
		num = keyhead.nextInt();
		
		sum = num + sum; 
		while (num!=0) {
			System.out.println("The total so far is " + sum + ".");
			System.out.println("Number: ");
			num = keyhead.nextInt();
			sum = num + sum;
		}
		System.out.println();
		System.out.println("The total is "+sum+".");
			
	    
		
	}
}
