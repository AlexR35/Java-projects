package programbydoing;
import java.util.Scanner;
public class toyoung {
	public static void main(String[] args) {
		
		
				
		Scanner rowdyinput = new Scanner(System.in);
		
		System.out.println(" Whats your name?: ");
		String name = rowdyinput.nextLine();
		
		System.out.println(" Okay cool, " + name + ", how old are you? ");
		int age = rowdyinput.nextInt();
		
		if (age < 16)
		{
			System.out.println("You cant drive " + name + "." + " However, you can still get it in ;-)");
		}
		
		if (age < 18)
		{
			System.out.println("You cant vote " + name + ".");
		}
		
		if (age < 21)
		{
			System.out.println("You cant rent a damn car son! ");
		}
		
		if (age > 25)
		{
			System.out.println("The world is yours " + name);
		}
	
		
		}
	}








