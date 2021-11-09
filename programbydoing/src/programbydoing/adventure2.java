package programbydoing;
import java.util.Scanner;
public class adventure2 {
	public static void main(String [] args) {
		
		Scanner key = new Scanner(System.in);
		boolean chooseAgain = true; 
		String whatUserChoose = "";
		int nextRoom = 1; 
		
		// NEXT ROOM 
		// 1 = doorway
		// 2 = living room
		// 3 = bathroom hallway
		// 4 = kitchen 
		// 5 = second bathroom
		// 6 = bathroom
		// 7 = alex old room
		// 8 = kaza room
		while (chooseAgain == true) {
			
			
			if(nextRoom == 1) {
				// do you like cats or dogs
				System.out.println("You\'re in a small room, theres a \"doorway\" or head straight to the \"hall\".");
				System.out.println(">");
				whatUserChoose = key.nextLine();
			if (whatUserChoose.equals("hall")) 
					nextRoom = 3;
				
				 else if (whatUserChoose.equals("doorway")) 
					nextRoom = 2;
				else  
						System.out.println(whatUserChoose + " wasn't one of the options, try again.");
							
			}
			if(nextRoom == 2) {
				System.out.println("You have now entered the living room. From here choose to go into the \"bathroom\" or the \"kitchen\"");
				System.out.println(">");
				whatUserChoose = key.nextLine();
			if(whatUserChoose.equals("bathroom")){
					nextRoom = 6;
			}
			else if(whatUserChoose.equals("kitchen"));
					nextRoom = 4;
			}else { 
						System.out.println(whatUserChoose + " wasn't one of the options, try again.");
			
			if (nextRoom == 6) {
				System.out.println("The bathroom it is, after your done pooping two options. Go into \"alex old room\"  to the left or "
						+ "right into\"kaza room\"");
				System.out.println(">");
				whatUserChoose = key.nextLine();
				if(whatUserChoose.equals("alex old room")) {
					nextRoom = 7;
			}
			else if(whatUserChoose.equals("kaza room"));
				    nextRoom = 8;
				    System.out.println("You have no choice but to go back after this");
					nextRoom = 1;
			} else {
				System.out.println("Nope thats enough,plz out the house now..Ok can you please leave.");
				nextRoom = 0;
			System.out.println("Dont be big mad, kicked you out politely");
				
		   }
	 	 }
	   }
	}
  }