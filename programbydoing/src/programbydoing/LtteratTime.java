package programbydoing;
import java.util.Scanner;
public class LtteratTime {
	public static void main (String [] args) {
		
		Scanner kb = new Scanner(System.in); 

		System.out.print("What is your message? ");
		String message = kb.nextLine();

		System.out.println("\nYour message is " + message.length() + " characters long.");
		System.out.println("The first character is at position 0 and is '" + message.charAt(0) + "'.");
		int lastpos = message.length() - 1; // I dont understand why the -1?
		System.out.println("The last character is at position " + lastpos + " and is '" + message.charAt(lastpos) + "'.");
		System.out.println("\nHere are all the characters, one at a time:\n");

		for ( int i=0; i<message.length(); i++ ) //When we change i<message. to i<=message.length it stops when it's set on equal.
		{
			System.out.println("\t" + i + " - '" + message.charAt(i) + "'");
		}

		int a_count = 0;

		for ( int i=0; i<message.length(); i++ )
		{
			char letter = message.charAt(i);
			if ( letter == 'a' || letter == 'A' )
			{
				a_count++;
				
		int e_count = 0;
			
		for ( int e=0; i<message.length(); i++ )
				{
			char letter = message.charAt(i);
			if ( letter == 'e' || letter == 'E' )
					{
				e_count++;
				
				int e_count = 0;

		for ( int i=0; i<message.length(); i++ )
					{
			 char letter = message.charAt(i);
			if ( letter == 'i' || letter == 'I' )
							{
				i_count++;
				int c_count = 0;

		for ( int i=0; i<message.length(); i++ )
								{
			char letter = message.charAt(i);
			if ( letter == 'o' || letter == 'O' )
									{
				a_count++;
				int _count = 0;

		for ( int i=0; i<message.length(); i++ )
										{
			char letter = message.charAt(i);
			if ( letter == 'u' || letter == 'U' )
											{
				a_count++;
			}
		}

		System.out.println("\nYour message contains the letter 'a' " + a_count + " times. Isn't that interesting?");
		System.out.println("\nYour message contains the letter 'a' " + e_count + " times. Isn't that interesting?");
    	}
    }
}