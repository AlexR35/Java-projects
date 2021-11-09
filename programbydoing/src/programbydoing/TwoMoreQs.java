package programbydoing;
import java.util.Scanner;
public class TwoMoreQs {
	public static void main(String [] args) {
		Scanner key = new Scanner(System.in); 
			
		System.out.println("TWO MORE QUESTIONS, BABY!");
		System.out.println();
		System.out.println("Think of something and I'll try to guess it!");
		System.out.println(" ");
		System.out.println("Question 1) Does it stay inside or outside or both?");
		String ans = key.next();
		System.out.println(" ");
		System.out.println("Question 2) Is it alive?");
		String ans1 = key.next();
		System.out.println(" ");
	if(ans.equals("outside") && ans1.equals("yes")) {
			System.out.println("What else can you be thinking of besides a bison?");
	}else if(ans.equals("both") && ans1.equals("no")) {
			System.out.println("What else can you be thinking of besides a damn cell phone?");
	}else if(ans.equals("both") && ans1.equals("yes")) {
		System.out.println("What else can you be thinking of besides a female dog? haha");
	}else if(ans.equals("inside") && ans1.equals("no")) {
		System.out.println("What else can you be thinking of besides a shower curtain.");
	}else if(ans.equals("outside") && ans1.equals("no")) {
		System.out.println("What else can you be thinking of besides a high billboard with your mom on it?");
	}else if(ans.equals("inside") && ans1.equals("yes")) {
		System.out.println("What else can you be thinking of besides a cactus type of plant!");
				
				
			
		}
	}
	
	}



