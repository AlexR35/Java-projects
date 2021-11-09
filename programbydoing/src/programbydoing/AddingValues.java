package programbydoing;
import java.util.Scanner;
public class AddingValues {
	public static void main(String[] args) {
		
		Scanner rowdy = new Scanner(System.in);
			
		int nums = 0;
		int sums = 0;
		
		System.out.println("I will use and abuse the numbers you give me");
		System.out.println("Number: ");
		nums = rowdy.nextInt();
		sums = sums + nums;
		
			while (nums!=0) {
		System.out.println("The total so far is " + sums + ".");
		System.out.println("Number: ");
		nums = rowdy.nextInt();
		sums = sums + nums;
		
			}
		System.out.println();
		System.out.println("The total is " + sums +".");
		}		
	} 