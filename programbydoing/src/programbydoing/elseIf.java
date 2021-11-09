package programbydoing;

public class elseIf {

	public static void main (String [] args) {
		
		int people = 20;
		int useGps = 45;
		int noGps = 5;
		
		if (people < useGps)
		{
			System.out.println("It'll take 30 minutes longer. ");
		}
		
		else if (people > useGps)
		{
			System.out.println("We will get home faster.");
		}
		
		else 
		{
			System.out.println(" We will be on stanby, until traffic slows down");
		}
		
		noGps+= 30;
		
		if (noGps >= people)
		{
			System.out.println("I still need to learn the local area.");
		}
		
		else if (noGps <= people)
		{
			System.out.println("I'm great with directions.");
		}
		else 
		{
			System.out.println("I need to ask for directions.");
		}
		
		if (noGps < useGps)
		{
			System.out.println("We may be lost.");
		}
		
		else
		{
			System.out.println("Lets go the town we are familiar with");
		}
			
	
	}
}
