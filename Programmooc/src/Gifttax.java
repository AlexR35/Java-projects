import java.util.Scanner;
public class Gifttax {
		public static void main(String [] args) {
		
			Scanner key = new Scanner(System.in);
			
			System.out.println("Whats your gift number:");
			int number = Integer.valueOf(key.nextLine());
			
			if (number >= 5000 && number <=25000) {
				System.out.println("The gift tax is " + 100 + (number - 5000)*.08);
			
			if (number >= 25000 && number <=55000) {
				System.out.println("The gift tax is " + 1700 + (number - 25000)*.10);
				
			if (number >= 55000 && number <=200000) {
				System.out.println("The gift tax is " + 4700+ (number - 55000)*.12);
		  }	
		}
	 }
  }	
}
