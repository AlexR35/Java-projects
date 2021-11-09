import java.util.Scanner;
public class Loopexercise1 {
		public static void main (String [] args) {
			Scanner key = new Scanner(System.in);
			
			int zero = 0;
			int sum = 0;
			while(true) {
			System.out.println("Give me a number:");
			int num = key.nextInt();
			
			if(num >0) {
			  zero = zero + 1;
			  sum = num + zero;
			  
			}else if (num == 0) {
				break;		
			}
			

				System.out.println("The total number of inputted values are : "+ sum);
		  }
	   }		
	}

