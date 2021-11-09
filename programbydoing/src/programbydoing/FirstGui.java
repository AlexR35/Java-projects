package programbydoing;
import javax.swing.*;
public class FirstGui {
	public static void main(String[] args) {
		
		String name = JOptionPane.showInputDialog("What is your name?");
		
		String input = JOptionPane.showInputDialog("How old are you?");
		int age = Integer.parseInt(input);
		
		System.out.print("Hello," + name + ". ");
		System.out.println("\nNext year, you'll be" + (age+1) );
		
	}
	
}
