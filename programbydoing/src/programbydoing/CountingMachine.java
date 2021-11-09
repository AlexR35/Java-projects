package programbydoing;
import java.util.Scanner;
public class CountingMachine {
	public static void main(String [] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int n = 0;
		
		
		System.out.println("Count to: ");
		int count = keyboard.nextInt();
		for (n = n; n <= count; n = n + 1) {
		System.out.println(n);
		}
		
	}
}
