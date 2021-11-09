package programbydoing;
import java.util.Scanner;
public class YourOwnAdventure {
		public static void main(String[]args) {
			
			Scanner rowdy = new Scanner(System.in);
			
		System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!");
		System.out.println();
		System.out.println("You are in a creepy house!  Would you like to go \"upstairs\" or into the\n"
				+ "\"kitchen\"?");
		System.out.println("> ");
		String ans = rowdy.next();	
	if(ans.equals("upstairs")){
		System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master\n"
				+ "\"bedroom\".  There is also a \"bathroom\" off the hallway.  Where would you like\n"
				+ "to go?");
		System.out.print("> ");
		ans = rowdy.next();	
	if(ans.equals("bedroom")) {
		System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture.  The\n"
				+ "bed is unmade.  In the back of the room, the closet door is ajar.  Would you\n"
				+ "like to open the door? (\"yes\" or \"no\")");
		System.out.println("> ");
		ans = rowdy.next();
		if(ans.equals("yes")) { 
		System.out.println("In there are all the sleeping things you need for the bed. ");
	  }else if(ans.equals("no")) {
		System.out.println("Sleep naked then!");
		System.out.println(" ");
	  }
	
}else if(ans.equals("bathroom")); { //WHY IS IT PRINTING THE BATHROOM STATEMENT? AFTER THE BEDROOM QUESTION!!
	 	System.out.println("This bathroom is completely remodeled, you\"ll\" love the glass shower doors!"
	 			+ "Would you actually take a bath?");
	 	System.out.println(">  ");
	 	ans = rowdy.next();
	 	if(ans.equals("yes")) {
	 	System.out.println("All of the toiletries are in the closet across from the zink!");
	 	}else if(ans.equals("no")) {
	 	System.out.println("No need for them then");
	 	}
    }
}else if(ans.equals("kitchen")) {
		System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side\n"
				+ "there is, as you'd expect, a refrigerator. You may open the \"refrigerator\"\n"
				+ "or look in a \"cabinet\".");
		System.out.println("> ");
		ans = rowdy.next();
		if(ans.equals("cabinet")) {
		System.out.println("There are all types of snacks in there. Do you prefer healthy snacks?");
		System.out.println("> ");
		ans = rowdy.next();
		if(ans.equals("yes")){
		System.out.println("Great,we have gluten free, sugar, gmo free, you name it!");
		}else if(ans.equals("no")) {
		System.out.println("no junk food, so you are outta luck my friend");
	}
}else if(ans.equals("refrigerator")) {
		System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty.\n"
				+ "Would you like to eat some of the food? (\"yes\" or \"no\")");
		System.out.println("> ");
		ans = rowdy.next();
	    if(ans.equals("yes")) {
	    System.out.println("I know you can cook, so have it at it! My casa to casa");
	    }else if(ans.equals("no")) {
	    System.out.println("You\"ll\" become starvin marvin");
	   
			
		   }
		}
		
	   }
     }
   }
		
