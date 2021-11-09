import java.util.Scanner;
public class Whileloops {
		public static void main (String [] args) {
			
			Scanner key = new Scanner(System.in);
			/*
			int numbersRead = 0;
			int sum = 0;
			
			while(true) {
				if (numbersRead ==5) {
					break;	
				}
			System.out.println("Input Number");
			sum = sum + Integer.valueOf(key.nextLine());
			numbersRead = numbersRead + 1; //helps stop the loop
			}
			System.out.println("The sum of the numbers is  "+ sum);
			*/
			
			int number = 0;
			while (true) {
			    System.out.println(number);
			    if (number >= 5) {
			        break;
			    }
			    number = number + 1;
			}
			System.out.println("Ready!" + " ");
			
			/*
			while (true) {
			    System.out.println("Exit? (y exits)");
			    String input = key.nextLine();
			    if (input.equals("y")) {
			        break;
			 }
			System.out.println("Ok! Let's carry on!");
			}
			System.out.println("Ready!");
			*/
			/*
			while (true) {
			    System.out.println("Input a number, 0 to quit");
			    int command = Integer.valueOf(key.nextLine());
			    if (command == 0) {
			        break;
			}
			 System.out.println("You input " + command);
			}
			System.out.println("Done, thank you!");
			*/
			/*
		      	while (true) {
			    System.out.println("Input positive numbers.");
			    int number = Integer.valueOf(key.nextLine());

			    if (number == 0) {
			        break;
			    }
			    if (number < 0) {
			        System.out.println("Unfit number! Try again.");
			        continue;
			    }
			    System.out.println("Your input was " + number);
			    */
		     	}
			}	
		
