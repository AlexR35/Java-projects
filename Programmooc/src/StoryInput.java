import java.util.Scanner;
public class StoryInput {
		public static void main(String [] args) {
			
			Scanner key = new Scanner (System.in);
			
					System.out.println("What's your name?" );
					String name = key.nextLine();
					System.out.println("Okay " +name+ " nice meeting ya for the first time. ");

					System.out.println("What's your age?" );
					int age = key.nextInt();
					
					System.out.println("What field of work are you involved in?" );
					String work = key.next();
					System.out.println();
					
					System.out.println(name + " it was a pleasure talking. I see that your age of  "+ age+
							"is in line with the " + work + " field.");
					System.out.println("I see a young "+age+ " taking themselves very far one day. "
							+ "Maintain your consistency!");
     }
 }
