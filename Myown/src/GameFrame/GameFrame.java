package GameFrame;
import javax.swing.JFrame;

import SnakeGame.GamePanel;

public class GameFrame extends JFrame{

	public GameFrame(){
		//GamePanel panel = new GamePanel(); INSTEAD USE THE SHORT CUTT BELOW
		
				this.add(new GamePanel());
				this.setTitle("Snake");
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				this.setResizable(false);
				this.pack();
				this.setVisible(true);
				this.setLocationRelativeTo(null);
	}
}
