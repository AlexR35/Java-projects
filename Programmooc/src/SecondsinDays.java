import java.util.Scanner;
public class SecondsinDays {
	public static void main (String [] args) {
		
		Scanner key = new Scanner(System.in);
		/*
		int day = 1;	
		int secondsInDay = 86400;
		System.out.println("How may days would you like to convert into seconds?");
		int entry = key.nextInt();
		int convertDayToSeconds = (entry * day) * 86400;
		System.out.println(convertDayToSeconds);
		*/
		System.out.println("Give a number:");
		int number = Integer.valueOf(key.nextLine());
		System.out.println("You gave " + number + " days");
		int convertDayToSeconds = number * 86400;
		System.out.println("There are " +convertDayToSeconds+" thousand "
				+ "seconds In those days.");
		
		
	}
}
