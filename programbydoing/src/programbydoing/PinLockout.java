package programbydoing;
import java.util.Scanner;
public class PinLockout {
	public static void main(String [] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		int pin = 41520;
		int tries = 0;
		
		System.out.println("WELCOME TO WORRYFREE BANNK.");
		System.out.println("ENTER THAT PIN BRUH: ");
		int entry = keyboard.nextInt();
		
		while(entry!=pin && tries <=2) {
			
		System.out.println("INCORRECT ENTRY. TRY AGAIN.");
		System.out.println("ENTER YOUR PIN MAM: ");
		entry = keyboard.nextInt();
		tries++;
		
		}
		
		if(entry == pin)
			System.out.println("SUCCESSFULLY LOGGED ON. ");
		else if (tries >= 2)
			System.out.println("COMPLETELY LOCKED NOW. ");
			
		 }		
	 }


