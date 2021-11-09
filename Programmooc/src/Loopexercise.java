import java.util.Scanner;
public class Loopexercise {
		public static void main(String [] args) {
		
			Scanner key = new Scanner(System.in);
			/*
			while (true) {
				System.out.println("Input a number");
				int number = key.nextInt();
				
				if (number == 0) {
					break;
				} else if (number <0) {
			    	System.out.println("Unfit number ");
			    	continue;    	  	
			    }
			    System.out.println(number * number);	   
			    */
			/*
			   while (true) {
			        System.out.println("Input a number ");
			        int number = Integer.valueOf(key.nextLine());

			        if (number < 0) {
			            System.out.println("Unfit number");
			        } else if (number == 0) {
			            break;
			        } else {
			           System.out.println(number * number);
			           */
					int ones = 0;
			        	while(true) {
			        	System.out.println("Give a number (end with 0): ");
			            // The task is to read a user inputted number
			            int number = Integer.valueOf(key.nextLine());

			            // The task is to exit the loop if the user
			            // has inputted zero
			            if (number == 0) {
			                break;
			            }
			            // The task is to increase the amount of ones
			            // if the user inputs a number one
			            if (number == 1) {
			                ones = ones + 1;
			        }        
			 }		
			        	// The task is to print out the total of ones
			        	System.out.println("The total of ones: " + ones);
	 }		
}