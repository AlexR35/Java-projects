package programbydoing;
import java.util.Scanner;
public class collatzsequence {
	public static void main(String [] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.println("Starting number:");
		int n = key.nextInt();
		
		while (n != 1) {
			
			if(isEven(n)) {
				n = n / 2;
			}else{
				n = n * 3 + 1;
			}
			System.out.print(n + "       ");
		}
	}
	
	public static Boolean isEven (Integer i) {
	    return (i % 2) == 0;

	}
}
