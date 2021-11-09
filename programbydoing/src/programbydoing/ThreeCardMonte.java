package programbydoing;
import java.util. Random;
import java.util.Scanner;
public class ThreeCardMonte {
		public static void main(String [] args) {
	
			Random r = new Random();
			
			int ace = 1+r.nextInt(3);
			Scanner key = new Scanner(System.in);
			System.out.println("You slide up to Fast Eddie's card table and plop down your cash.\n"
					+ "He glances at you out of the corner of his eye and starts shuffling.\n"
					+ "He lays down three cards.\n"
					+ "");
			 System.out.println();
			
			 System.out.println("Which one is the ace?");
			 System.out.println();
			 System.out.println("\t\t##  	 	##  	##");
			 System.out.println("\t\t##  		##  	##");
			 System.out.println("\t\t1   		 2    	3");
			 System.out.println(" > ");
		   int choice = key.nextInt();
		
			if(choice!= ace) {
					System.out.println(" Ha! Fast Eddie wins again! The ace was card number  "+ ace);
					System.out.println();
			if(ace==1) {
				System.out.println("\t\tAA		##		##");
				System.out.println("\t\tAA		##		##");
				System.out.println("\t\t1			2			3");
				
				
			}
			}
    }
}
