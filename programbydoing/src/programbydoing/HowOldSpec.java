package programbydoing;
import java.util.Scanner;
public class HowOldSpec {
	
	public static void main(String [] args) {
		
		Scanner rowdyboard = new Scanner(System.in);
		
		System.out.println("Hey whats your name again?");
		String name = rowdyboard.nextLine();
		System.out.println("Ok " + name + "," + " how old are you?");
		int age = rowdyboard.nextInt();
		System.out.println();
		
		if (age < 16)
		{
			System.out.println( "You cant drive" + name);
		}
		else if (age>=16 && age<=17)
		{
		    System.out.println("You can drive but not vote.");
		}
		else if (age>=18 && age<=24)
		{
		    System.out.println("You can vote but not rent a car son!");
		}
		else if (age>=25)
		{
		    System.out.println("You can do whatever the fuck you like. " + name); 
		}
		
	}  
	

}
