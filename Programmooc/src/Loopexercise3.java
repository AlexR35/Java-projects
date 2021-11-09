import java.util.Scanner;
public class Loopexercise3 {
		public static void main (String [] args) {
			
			Scanner key = new Scanner(System.in);
			
			  int numberOfPositives = 0;
			  int numberOfNegatives = 0;
			  
			  while(true) {
				  System.out.println("Give a number(0 to stop)");
				  int numFromUser = key.nextInt();
				  
				  if(numFromUser == 0) {
					  break;
				  }
				  if(numFromUser> 0) {
					  numberOfPositives = numberOfPositives +1;
				  }
				  if (numFromUser< 0) {
					  numberOfNegatives = numberOfNegatives + 1;
				  }	  
					  // Also could have used..
					    // if (numberFromUser > 0) {
					    //     numberOfPositives = numberOfPositives + 1;
					    // } else {
					    //     numberOfNegatives = numberOfNegatives + 1;
					    // }
					  System.out.println("Positive numbers: " + numberOfPositives);
					  System.out.println("Negative numbers: " + numberOfNegatives);
					  
					  if( numberOfPositives + numberOfNegatives > 0) {
					  double percentageOfPositives = 100.0 * numberOfPositives / 
							  (numberOfPositives + numberOfNegatives);
					  System.out.println("The percentage of positive numbers: "+percentageOfPositives + "%");
					  
		   }	
	     }
	  }  
   }