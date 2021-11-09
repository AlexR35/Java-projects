package programbydoing;
import java.util.Scanner;
public class TwentyQuestions {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
	
		String answer = "";
		String answer1 = "";
		
		
	System.out.println("TWO QUESTIONS!");
	System.out.println("Think of an object, and ill try to guess it!");
	System.out.println();
	System.out.println("Question 1) Is it an animal, vegetable, or mineral?");
	System.out.println("> ");
	answer=keyboard.next();
	System.out.println("Question 2) Is it bigger than a breadbox?");
	System.out.println("> ");
	answer1=keyboard.next();
	System.out.println();
	if(answer1.equals("yes")) {
		if(answer.equals("animal")) {
				System.out.println("My guess is you're thinking of bear.");
		   }else if(answer.equals("Vegetable")){
			    System.out.println("My guess is your thinking of a carrot.");
		   }else if(answer.equals("Mineral")) {
			    System.out.println("You're thinking about an SUV aren't you?");
		   }
		
	   }else if(answer1.equals("no")) {
		   if(answer.equals("animal")) {
			   System.out.println("My guess is your thinking of a racoon");
		   }else if(answer.equals("mineral")) {
			   System.out.println("You must be thinking of a aluminum!");
		   }else if(answer.equals("vegetable")){
			   System.out.println("You're thinking of asparagus!");
			   
		   }
		   
	   }
	   System.out.println("I'd ask you but na dont really care");  
	   }

  }
     

