package programbydoing;
import java.util.Scanner;
public class GenderGame {
	public static void main(String [] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your gender (m or f):");
		String gender = keyboard.next();
		System.out.println("First name: ");
		String fname = keyboard.next();
		System.out.println("Last name: ");
		String lname = keyboard.next();
		System.out.println("Age: ");
		int age = keyboard.nextInt();
		//System.out.println("Are you married, " + fname + "(y or n)?");
		String marry = "";
		String name = fname + " " + lname;
		
		if (age < 20) {
			System.out.println(" Then I shall call you " + name);
		}else if(age >= 20 && gender.equals("f")) {
			System.out.println("Are you married, " + name + " (y or n)?");
			marry = keyboard.next();
			if(marry.equals("y")) {
				System.out.println("Then I shall call you Mrs. " + fname + ".");
			}else{ 
				System.out.println("Then I shall call you Ms. " + name + ".");
			}
		}
		if(age >= 20 && gender.equals("m")){
			System.out.println("We will call you Mr. " + lname + ".");
		}
		if(age<20) {
			System.out.println("Then I shall call you " + name+ ".");
			
		     }
		
	      }
      }
