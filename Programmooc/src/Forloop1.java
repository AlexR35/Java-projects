import java.util.Scanner;
public class Forloop1 {
		public static void main (String [] args) {
			
			Scanner key = new Scanner(System.in);
			/*
			int num = key.nextInt();
			
			for (int i = num; i <100; i= i+3) {
				System.out.println(i);
				*/
			/*
			System.out.println("Where to");
			int first = 1;
			int end = key.nextInt();
			
			for(int i = first; i < end; i++ ) {
				System.out.println(i);
			*/
				System.out.println("Where from? ");
				int first = key.nextInt();
				System.out.println("Where to? ");
				int end = key.nextInt();
							
				for(int i = first; i < end; i++ ) {
					System.out.println(i);
				
	  }
   }
}