package programbydoing;
import java.util.*;
import java.util.Scanner;

public class squareroot {
	public static void main(String [] args) {
		
		Scanner enter = new Scanner(System.in);
		
		System.out.println("SQUARE ROOT!");
		System.out.println("Enter a number: ");
	    int num = enter.nextInt();
	    
	    	if (num<0);
	    	do{
	    		System.out.println("Negative number dont give ya a square root silly.");
	    		System.out.println("Try again: ");
	    }
	    	while (num<0);
	    	{	
	    		double root = Math.sqrt(num);
	    			
	    		System.out.println("The sqaure root of " +num+ " is " +root );		
	    		
	    }
	 }
  }