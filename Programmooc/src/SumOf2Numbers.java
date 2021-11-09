import java.util.Scanner;
public class SumOf2Numbers {
	public static void main(String [] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Give the first number: ");
		int first = Integer.valueOf(key.nextLine());
		System.out.println("Give the second number: ");
		int second = Integer.valueOf(key.nextLine());
		
		int sum = first + second;
		System.out.println(sum);
		
	}
}
