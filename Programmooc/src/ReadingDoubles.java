import java.util.Scanner;
public class ReadingDoubles {
		public static void main (String[]args) {
			Scanner key = new Scanner(System.in);
			
			// READING DOUBLES
						//String valueAsString = "42.42";
						//double value = Double.valueOf(valueAsString);
						//System.out.println(value);
				        System.out.println("Write a value ");
				        double value = Double.valueOf(key.nextLine());
				        System.out.println("You wrote " + value);
		}
}
