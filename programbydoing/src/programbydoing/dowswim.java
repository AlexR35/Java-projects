package programbydoing;
import java.util.Scanner;
public class dowswim {
	public static void main (String [] args) {
		
		//NEED TO FIX THIS PROGRAM
		
		Scanner keyboard = new Scanner(System.in);
		String swimmer1 = "Chalex";
		String swimmer2 = "MrDickleton";
		
		double minimumTemperature = 79.0; //degrees Farenheit
		double currentTemperature;
		double savedTemperature;
		int swimTime;
		
		System.out.println("What is the current water temperature? ");
		minimumTemperature = keyboard.nextDouble();
		savedTemperature = currentTemperature ; //Saves a copy to get it back later 
		
		System.out.println("\nOkay, so the current is " + currentTemperature + "F");
		System.out.println(swimmer1 + "Approaches the lake...");
		
		swimTime = 0;
		
		while(currentTemperature >= minimumTemperature) {
			
			System.out.print("\t" + swimmer1 + "swims for a bit.");
			swimTime++;
			System.out.println("Swim Time: " + swimTime + "min");
			//Thread.sleep(600); //pauses for 600 miliseconds
			currentTemperature -= 0.5; //subtracts half a degree from the temperature
			System.out.println("The current water temperature is now " + currentTemperature + "F");
		}	
		
		System.out.println(swimmer1 + "Stops swimming. Total swim time: " + swimTime+"min");
		currentTemperature = savedTemperature; //Restores original water temperature;
		
		System.out.println( "\nOkay, so the current water temperature is " + currentTemperature + "F." );
        System.out.println( swimmer2 + " approaches the lake...." );

        swimTime = 0;
        do 
        {	
        	System.out.print( "\t" + swimmer2 + " swims for a bit." );
            swimTime++;
            System.out.println( " Swim time: " + swimTime + " min." );
            //Thread.sleep(600);
            currentTemperature -= 0.5;
            System.out.println( "\tThe current water temperature is now " + currentTemperature + "F." );

        } while ( currentTemperature >= minimumTemperature );

        System.out.println( swimmer2 + " stops swimming. Total swim time: " + swimTime + " min." );
		
	}
}