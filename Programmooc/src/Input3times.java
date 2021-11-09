import java.util.Scanner;
public class Input3times {
		public static void main(String [] args) {
			
			Scanner key = new Scanner(System.in);
			
			System.out.println("Write a message below");
			String first = key.nextLine();
			
			System.out.println("Write a second message below");
			String second = key.nextLine();
			
			System.out.println("Write a third message below");
		    String third = key.nextLine();
		    
		    System.out.println("You wrote");
		    System.out.println(first);
		    System.out.println(second);
		    System.out.println(third);
		 
		 
		}
}
