package programbydoing;
import java.util.Scanner;
public class babyNim {
	public static void main(String [] args) {
		
		Scanner key = new Scanner(System.in);
		
		int A = 3;
		int B = 3;
		int C = 3;
		
		String pile = "";
		int remover;
		
		while(A>0 || B>0 || C>0) {
		
		System.out.println("A: "+A+" B: "+B+" C: "+C);
		System.out.println();
		
		System.out.println("Choose a pile: ");
		pile = key.next();
		System.out.println("How many to remove from pile: "+pile);
		remover = key.nextInt();
	
		if(pile.equals("A")) {
			A = A - remover;
		}else if(pile.equals("B")) {
			B = B - remover;
		}else if (pile.equals("C")) {
			C = C - remover;
			
		}else if (A<=0 && B<=0 && C<=0) {
			System.out.println("All piles are now empty, good stuff!");
			
		  }
	   }
	}
}