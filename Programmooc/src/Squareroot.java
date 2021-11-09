import java.util.Scanner;
public class Squareroot {
		public static void main(String[]args) {
			
			Scanner key = new Scanner(System.in);
			
			int num1 = Integer.valueOf(key.nextLine());
			int num2 = Integer.valueOf(key.nextLine());
			
			double sum = num1 + num2;
			double squareRoot = Math.sqrt(sum);
			
			if ( squareRoot >100) {
				System.out.println("Too much");
			}else if (squareRoot < 0) {
				System.out.println("To little");
			}else { 
				System.out.println("ok");
				
			}
			//System.out.println(squareRoot);
		}	
}
