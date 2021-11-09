package programbydoing;
import java.util.Scanner;
public class righttrianglechecker {
	public static void main(String [] args) {
		
		Scanner rowdy = new Scanner(System.in);
		
		System.out.println("Enter three integers:");
		System.out.println("Side 1: ");
		int side1 = rowdy.nextInt();
		System.out.println("Side 2 :");
		int side2 = rowdy.nextInt();
		
		while(side2<side1) {
			System.out.println(side2 + " is smaller than " + side1 + " Try again.");
			System.out.println("Side 2: ");
			side2 = rowdy.nextInt();

			
		}
		System.out.println("Side 3 :");
		int side3 = rowdy.nextInt();
	    while(side3<side2) {
	    	System.out.println(side3 + " is smaller than " + side2 + " Try again.");
	    	System.out.println("Side 3 :");	
	    }
	    
		System.out.println();
		int total =(side1*side1 + side2*side2);
		double s3 = Math.sqrt(total);
		if(s3 == side3) {
			System.out.println("Your three sides are " + side1 +side2 + side3);
			System.out.println("These sides *do* make a right triangle. YA HEARD!");
		}else {
			System.out.println("NO! These sides do make a triangle!");

				
		 }
      }
   }
