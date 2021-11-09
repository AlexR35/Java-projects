package programbydoing;
							//PROGRAM TO CALCULATE BMI 
import java.util.Scanner;

public class learnTen {

	public static void main(String[] args) {
		
		Scanner rowdyboard = new Scanner(System.in);
		 
				
		System.out.println("Your height(in feet): ");
		double heightFt = rowdyboard.nextDouble();
		
		System.out.println("Your height (in inches): ");
		double heightIn = rowdyboard.nextDouble();
		
		double height = 12*heightFt+heightIn; // CONVERTED HEIGHT INTO INCHES
		
		System.out.println("Your weight in pounds is: ");
		int weight = rowdyboard.nextInt();
		
		double convertToKilo = weight / 2.205;
		double heightFtToM = height/ 39.37;
		double bmi = convertToKilo/(heightFtToM * heightFtToM);
		
		System.out.println("Your Bmi is: " + bmi);
		
		
		
	}

}
