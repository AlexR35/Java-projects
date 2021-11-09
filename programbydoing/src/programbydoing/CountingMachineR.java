package programbydoing;
import java.util.Scanner;
public class CountingMachineR {
	public static void main (String [] args) {
		
		Scanner key = new Scanner(System.in);
	
		
		System.out.println("Count from: ");
		int from = key.nextInt();
		System.out.println("Count to: ");
		int to = key.nextInt();
		System.out.println("Count by: ");
		int by = key.nextInt();
		System.out.println();
		for(int n = from ; n <= to; n = n + by) {
		System.out.println(n + "");
		
	}
  }
}