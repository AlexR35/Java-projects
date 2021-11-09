import java.util.Scanner;
public class Converttypes {
	public static  void main (String [] args) {
		
		Scanner key = new Scanner(System.in);
		
			// READING INTEGERS
			//String valueAsString = "42";
			//int value = Integer.valueOf(valueAsString);
			//System.out.println(value);
		 	System.out.println("Write a value ");
	        int value = Integer.valueOf(key.nextLine());
	        System.out.println("You wrote " + value);
			
	        // READING DOUBLES
			//String valueAsString = "42.42";
			//double value = Double.valueOf(valueAsString);
			//System.out.println(value);
	        System.out.println("Write a value ");
	        double value = Double.valueOf(key.nextLine());
	        System.out.println("You wrote " + value);
	        
	        //READING BOOLEANS
	        System.out.println("Write a boolean ");
	        boolean value = Boolean.valueOf(key.nextLine());
	        System.out.println("You wrote " + value);
			
			
			int i=10;  
			String s=Integer.toString(i);
			System.out.println(s);
			
			
			
		}	
   }