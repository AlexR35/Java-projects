package programbydoing;
import java.util.Scanner;
public class nim {
	public static void main (String [] args) {
	
		Scanner key = new Scanner(System.in);
		
		int A = 3;
		int B = 4;
		int C = 5;
		
		String pile = "";
		int remover;
		
		
		while (A>0 || B>0 || C>0) {
		System.out.println("Player 1, enter your name:");
		String plyr1 = key.next();
		System.out.println("Player 2, enter your name:");
		String plyr2 = key.next();
		System.out.println();
		
		System.out.println("A: "+A+" B "+B+" C "+C);
		System.out.println();
		
		plyr1 = pile;
		plyr2 = pile;
		
		if(pile.equals("A")) {
			A = A - remover;
		}else if(pile.equals("B")) {
			B = B - remover;
		}else if (pile.equals("C")) {
			C = C - remover;
		}
		
		System.out.println(plyr1 +" , choose a pile: ");
		pile = key.next();
		System.out.println();
		System.out.println("How many to remove from pile: "+pile);
		remover = key.nextInt();
		System.out.println();
		System.out.println("A: "+A+" B "+B+" C "+C);
		System.out.println();
		
		System.out.println(plyr2 +" , choose a pile: ");
		pile = key.next();
		System.out.println();
		System.out.println("How many to remove from pile: "+pile);
		remover = key.nextInt();
		System.out.println();
		System.out.println("A: "+A+" B "+B+" C "+C);
		System.out.println();
		
		
		if(pile.equals(A<=0 && B<=0 && C<=0)) {
		System.out.println(plyr1 +", there are no counters left, so you WIN!");
		
		}else if(pile.equals(A<=0 && B<=0 && C<=0)) {
			System.out.println(plyr2 +", there are no counters left, so you WIN!");
			
     	 }
      }
	}	
}
