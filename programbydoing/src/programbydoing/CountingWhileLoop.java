package programbydoing;
import java.util.Scanner;
public class CountingWhileLoop {

	public static void main(String[]args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Type in a message and i\'ll display it 10 times");
		System.out.println(" Message: ");
		String message = keyboard.next();
		
		int n = 10;
		while (n  <= 100) {
			
			System.out.println( (n) + ". " + message );
			n = n + 10;
			//COME BACK TO THIS AND FIGURE THE TIMES 10
		}	
	}
}
