package programbydoing;
import java.util.Scanner;
public class BmiCategories {
	public static void main(String [] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		
		
		System.out.println("Your height in inches: ");
		double inches = keyboard.nextInt();
		System.out.println(" ");
		System.out.println("Your weight in pounds: ");
		double pounds = keyboard.nextInt();
		System.out.println(" ");
		
		
		double bmi = pounds / (inches * inches) * 703;
		
		double finalValue = Math.round( bmi * 100.0 ) / 100.0;

		System.out.println("Your BMI is: " + finalValue);
		if(bmi < 15.0) {
			System.out.println("BMI category: Very severly underweight");
		}else if(bmi >= 15.0 && bmi <=16.0){
			System.out.println("BMI category: Severly underweight");
		}else if(bmi >= 16.1 && bmi <=18.4){
			System.out.println("BMI category: underweight");
		}else if(bmi >= 18.5 && bmi <=24.9){
			System.out.println("BMI category: normal weight");
		}else if(bmi >= 25.0 && bmi <=29.9){
			System.out.println("BMI category: overweight");
		}else if(bmi >= 30.0 && bmi <= 34.9){
			System.out.println("BMI category: moderately obese");
		}else if(bmi >= 35.0 && bmi <= 39.9){
			System.out.println("BMI category: severly obese");
		}else if(bmi >= 40.0){
			System.out.println("BMI category: severe or morbidly obese");
			
		}
	}
}

