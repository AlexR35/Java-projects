package SmallerSnakeGame;

public class SmGamePanel  extends JPanel{


	private static final long serialVersionUID = 1L;
	
	public static final int WIDTH = 500, HEIGHT = 500;
	
	private Thread thread;
	private boolean running;
	
	
	public SmGamePanel() {
		
		setPreferredSize(new Dimension(WIDTH_HEIGHT));
		
	}
	
	public void start() {
		running = true;
		thread = new Thread(this);
		thread.start();		
	}
	public void stop() {
		running = false
				thread.join();
	}
	
}