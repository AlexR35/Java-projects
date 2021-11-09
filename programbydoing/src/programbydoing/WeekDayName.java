package programbydoing;
import java.util.GregorianCalendar;

public class WeekDayName {

	public static String WeekDayName( int weekday )
	{
		String result = "";

		if ( weekday == 1 )
		{
			result = "Sunday";
		}
		else if ( weekday == 2 )
		{
			result = "Monday";
		}

		else if ( weekday == 3 )
		{
			result = "Tuesday";
		}
		else if ( weekday == 4 )
		{
			result = "Wednesday";
		}


		else if ( weekday == 5 )
		{
			result = "Thursday";
		}
		else if ( weekday == 6 )
		{
			result = "Friday";
		}
		else if (weekday == 7)
		{
			result = "Saturday";
		}
		return result;
	 }
		
	public static void main(String [] args) {
	
		System.out.println("Weekday 1: " + WeekDayName(1)   );
		System.out.println("Weekday 2: " + WeekDayName(2)   );
		System.out.println("Weekday 3: " + WeekDayName(3)   );
		System.out.println("Weekday 4: " + WeekDayName(4)   );
		System.out.println("Weekday 5: " + WeekDayName(5)   );
		System.out.println("Weekday 6: " + WeekDayName(6)   );
		System.out.println("Weekday 7: " + WeekDayName(7)   );
		System.out.println("Weekday 0: " + WeekDayName(0)   );
		System.out.println();
		System.out.println("Weekday 35: " + WeekDayName(35)   );
		System.out.println("Weekday 19: " + WeekDayName(19)   );
		System.out.println("Weekday -1: " + WeekDayName(-1)   );
				
		GregorianCalendar cal = new GregorianCalendar();  
		int dow = cal.get(GregorianCalendar.DAY_OF_WEEK); // DONT UNDERSTAND HOW THIS GREGORIAN CAL PACKAGE WORKS, OR HOW ITS CALLED OUT
		
		System.out.println("\nToday is a " + WeekDayName(dow) + "!");

     }
}