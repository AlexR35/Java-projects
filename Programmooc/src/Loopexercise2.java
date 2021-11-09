import java.util.Scanner;
public class Loopexercise2 {
			public static void main (String [] args) {
				
				Scanner key = new Scanner(System.in);
				
				int sum = 0;
				int zero = 0;
				//int averageOfNums;
				
				while(true) {
				System.out.println("Give a number:");
				int num = key.nextInt();
					
					int averagesOfNums =  sum/ num;
				System.out.println("The sum is: "+sum+" while the average is: "+ averagesOfNums);
				sum = num + sum;	
					
				if(num == 0) {
						break;
				}
				if (num>0) {
					
				}
					zero = zero ++;	
				
				
											
		}						
	}
}