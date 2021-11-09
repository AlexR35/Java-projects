package programbydoing;

import java.util.ArrayList;

public class BasicArrays1 {
		public static void main(String [] args) {
			
			ArrayList listTest = new ArrayList();
			listTest.add("-113");
			int [] slot = {0,1,2,3,4,5,6,7,8,9};
			for(int i=0; i<slot.length;i++) {
				System.out.println("Slot " + slot[i] +" contains a "+ listTest.get(0) );
		}
	}
}
