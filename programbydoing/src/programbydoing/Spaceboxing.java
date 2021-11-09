package programbydoing;
import java.util.Scanner;
public class Spaceboxing {

	public static void main (String [] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter your current earth weight:");
		double weight = keyboard.nextDouble();
		
		System.out.println("I have information for the following planets: " +
		"1. Venis   " + "2. Mars   " + "3. Jupiter   " + 
		"4.Saturn   " + "5.Uranus   " + "6.Neptune   ");
		int planet = keyboard.nextInt();
		
		if (planet == 1)
		{
			System.out.println(weight *0.78);
		}
		else if (planet == 2)
		{
			System.out.println(weight *0.39);
		}
		else if (planet == 3)
		{
			System.out.println(weight = weight *2.65); // LEARNED THAT DECLARING THE WEIGHT WAS UNNECESSARY
		}
		else if (planet == 4)
		{
			System.out.println(weight = weight *1.17);
		}
		else if(planet == 5)
		{
			System.out.println(weight = weight *1.05);
		}
		else if  (planet == 6)
		{
			System.out.println(weight = weight *1.23);
		}
		
	}
	
}
