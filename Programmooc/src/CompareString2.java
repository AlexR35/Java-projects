import java.util.Scanner;
public class CompareString2 {

	public static void main(String[] args) {

		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Input two strings");
		String first = key.nextLine();
		String second = key.nextLine();
		
		if (first.equals(second)){
			System.out.println("They're the same!");
		}else {
			System.out.println("They're different.");
		}
		if(first.equals("two strings")) {
			System.out.println("Sneaky link");
		}
		if(second.equals ("two strings")) {
			System.out.println("Cleverness");
			
		}
	}
}
