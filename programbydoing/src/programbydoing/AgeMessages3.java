package programbydoing;
import java.util.Scanner;
public class AgeMessages3 {
public static void main(String [] args) {
	
	Scanner enter = new Scanner(System.in);
	System.out.println("Your name: ");
	String name = enter.next();
	System.out.println(" ");
	System.out.println("Your age: ");
	
	int age = enter.nextInt();
	
	{
	if(age < 16) {
		System.out.println("You cant drive bruh! You can smash though, haha");	
	}if(age >= 16 && age <= 17) {
		System.out.println("You can drive but not vote.");
	}if(age >= 18 && age <= 24) {
		System.out.println("You can vote but not rent a van.");
	}if(age >= 25) {
		System.out.println("You can do whatever you like!!");	
		
    	 }
	  }
   }
}
	
	
	
		 
   

