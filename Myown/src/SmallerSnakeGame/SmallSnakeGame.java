package SmallerSnakeGame;

import javax.swing.JFrame;

public class SmallSnakeGame {
	public SmallSnakeGame() {
				
		JFrame frame = new JFrame();
	    SmGamePanel gamepanel = new SmGamePanel();
		
		frame.add(gamepanel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("SNAKECODING");
		frame.setLocationRelativeTo(null);

		
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main (String[] args) {
		
		new SmallSnakeGame();
	}
	
	
}
