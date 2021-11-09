package programbydoing;
import java.util.Random;
public class FortuneCookie {
		public static void main(String [] args) {
			
			Random r = new Random();
			int choice = 1 +r.nextInt(6);
			String response = " ";
			
			if (choice == 1)
				response = "Alex and Monica are always going to make it through";
			else if (choice ==2)
				response = "Take 10 deep breaths and ask what I am feeling";
			else if (choice ==3)
				response = "Tell yourself a new narrative about the relationship";
			else if (choice ==4)
				response = "Lead by example for your self, son and family";
			else if (choice ==5)
				response = "Love everyone around you no matter what";
			else if (choice ==6)
				response = "Choose love over fear";
			
			System.out.println("Fortune cookie says: "+ response);
		}
}
