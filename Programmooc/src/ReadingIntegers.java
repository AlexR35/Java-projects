import java.util.Scanner;
public class ReadingIntegers {
	public static void main(String [] args) {
		
		Scanner key = new Scanner(System.in);
		
		// READING INTEGERS
		String valueAsString = "85";
		int value = Integer.valueOf(valueAsString);
		System.out.println(value);
	 	//System.out.println("Write a value ");
        //int value = Integer.valueOf(key.nextLine());
        //System.out.println("You wrote " + value);
         
		
	}
}
         /*
         int number = Integer.valueOf(key.nextLine());
         int remainder = number % 400;

         if (remainder == 0) {
             System.out.println("The number " + number + " is divisible by four hundred.");
         } else {
             System.out.println("The number " + number + " is not divisible by four hundred.");
       */
       

