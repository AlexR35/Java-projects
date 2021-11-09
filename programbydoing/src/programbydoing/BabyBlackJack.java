package programbydoing;
import java.util.Scanner;
public class BabyBlackJack {
	public static void main(String [] args) {
		
		Scanner keyin = new Scanner(System.in);
		
		System.out.println("Baby Black Jack");
		
		
		
		int draw1 = keyin.nextInt();
		int draw2 = keyin.nextInt();
		int sum = draw1 + draw2;
		System.out.println("You drew "+draw1+" and "+draw2);
		System.out.println("Your total is "+sum);
		System.out.println();
		
		 draw1 = keyin.nextInt();
		 draw2 = keyin.nextInt();
		System.out.println("The dealer drew "+draw1+" and "+draw2);
		System.out.println("Dealer\'s total is "+sum+".");
		
		if(sum==10) {
			
			System.out.println("YOU WIN");
		}
		
		
	}
}
