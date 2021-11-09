package programbydoing;

public class CompareToChallenge {
	public static void main(String [] args) {
		
		System.out.print("Comparing \"axe\" with \"cat\" produces ");
		int i = "axe".compareTo("cat");
		System.out.println(i);

		System.out.print("Comparing \"applebee's\" with \"apple\" produces ");
		System.out.println( "applebee's".compareTo("apple") );
		
		String str1 = "String are";
		String str2 = "Strings are not";
		String str3 = "Strings are not ints";
		String str4 = "Jeep";
		String str5 = "Jetta";
		String str6 = "Blazer";
		String str7 = "Tesla";
		String str8 = "Honda";
		
		System.out.println("Comparing \"String are\" with \"Strings are not\" produces");
		int result = str1.compareTo(str2);
		
		System.out.println("Comparing \"String are\" with \"String are not ints\" produces");
		result = str1.compareTo(str3);
		
		System.out.println("Comparing \"Strings are not\" with \"Jeep\" produces");
		result = str2.compareTo(str4);
		
		System.out.println("Comparing \"Jeep\" with \"Jetta\" produces");
		result = str4.compareTo(str5);
		
		System.out.println("Comparing \"Blazer\" with \"Jetta\" produces");
		result = str6.compareTo(str5);
		
		System.out.println("Comparing \"Tesla\" with \"Honda\"produces");
		result = str7.compareTo(str8);
	}
}
