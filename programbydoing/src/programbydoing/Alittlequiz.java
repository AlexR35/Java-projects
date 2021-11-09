package programbydoing;
import java.util.Scanner;
public class Alittlequiz {
	public static void main (String[] args) {
		int correct = 0; //THIS THE SCORE, JUST ADDED THIS
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Are you ready for a quiz? ");
		String ans = keyboard.nextLine();
	   if(ans.equals("Y")) {
		   
	  
		   			System.out.println("Oh well, you gotta take it anyway!");
		   			System.out.println();
		System.out.println("Q1)  What is the capital of Alaska? ");
		System.out.println("\t\t 1) Melbourne");
		System.out.println("\t\t 2) Anchorage");
		System.out.println("\t\t 3) Juneau");
	    int capofA = keyboard.nextInt();
	    if (capofA == 3 )
	    {
	    	System.out.println("That\'s right!");
	    	correct++;  // WHAT DOES THE CORRECT ++ DO?
	    }else{ 
	   
		 System.out.println("Wrong, Juneau is the capital of Alaska");
	    }
		 
		 System.out.println();
		 System.out.println("Q2)" + "Can you store the value \"cat\" in a variable type int? ");
		 System.out.println("\t\t 1) Yes");  
		 System.out.println("\t\t 2) No");
		 int cat = keyboard.nextInt();
		 if (cat==1)
		 {
			 System.out.println("Sorry " + "cat " + "is a string, ints can only store numbers.");
		 }else {
			System.out.println("Bruh you got that right");
			System.out.println();
		 }
		 System.out.println("Q3)" + " What is the result of 9+6/3? " +
				 			"1) 5   " + "2) 11   " + "3) 15/3   ");
		 int result = keyboard.nextInt();
		 if(result > 2)
		 {
			 System.out.println("Thats correct");
	         System.out.println();
		 }
		 
		 if(correct==3)
		 {
			 System.out.println("Overall you got all 3 correct");
		 }else{
		 System.out.println("Overall, you got " + correct + "correct.");
		 
		 }
		 System.out.println("Thanks for playing");

        }
	}
}
