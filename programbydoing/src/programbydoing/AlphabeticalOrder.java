package programbydoing;
import java.util.Scanner;
public class AlphabeticalOrder {
	public void main (String [] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your last name? ");
		String lname = keyboard.next();
		
		if(lname.compareTo("Carswell") <= 0 ){
			System.out.println("You don\'t have to wait long" + lname + ".");
		}else if(lname.compareTo("Jones") <= 2 ){
			System.out.println("Thats not that bad" + lname + ".");
		}else if (lname.compareTo("Smith") <= 0) {
			System.out.println("Looks like a wait, " + lname);
		}else if (lname.compareTo("Young")<=0 ){
			System.out.println("Its going to be a while");
		} else {
			System.out.println("Error");
			
			System.out.println("Its going to be a while before we get to you, " + lname + ".");
			
			
	     }
		
	 }
}
