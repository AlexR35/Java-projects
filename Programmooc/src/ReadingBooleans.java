import java.util.Scanner;
public class ReadingBooleans {
		public static void main (String [] args) {
			Scanner key = new Scanner(System.in);
			
			//READING BOOLEANS
	        System.out.println("Write a boolean ");
	        boolean value = Boolean.valueOf(key.nextLine());
	        System.out.println("You wrote " + value);
			
		}
}
