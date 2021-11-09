package programbydoing;
import java.util.Random;
import java.util.ArrayList;

public class BasicArrays2{
	public static void main(String [] args) {
		
	ArrayList listTest = new ArrayList();
	Random rand = new Random(100);
	
	int [] slot = {0,1,2,3,4,5,6,7,8,9};
	for (int i = 0;i < slot.length; i++) {
	System.out.println("Slot "+slot[i]+ " contains a "+rand.nextInt(100));
	
      }
   }
}