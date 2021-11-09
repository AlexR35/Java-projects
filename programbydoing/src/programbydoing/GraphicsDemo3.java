package programbydoing;

	import java.awt.*;
	import javax.swing.JFrame;

	public class GraphicsDemo3 extends Canvas
	{
	    public void paint( Graphics g )
	    {
	        // lines
	        g.setColor(Color.green);
	        g.drawLine(10,100,400,100);
	        g.setColor(Color.red);
	        g.drawLine(200,230,200,30); 
	        g.setColor(Color.blue);    
	        g.drawLine(50,150,100,180);	/* x1 – It takes the first point’s x coordinate.
	        							   y1 – It takes first point’s y coordinate.
	        							   x2 – It takes second point’s x coordinate.
	        							   y2 – It takes second point’s y coordinate  */
	        g.setColor(Color.magenta);
	        g.drawLine(100,350,300,230);
	        g.setColor(Color.red);
	        g.drawLine(200,350,10,230); // X coordinates that represent a solid X to magenta are x1-350, x2-230
	        
	        g.setColor(Color.black);

	        // fonts
	        g.drawString("Graphics are pretty neat.", 500, 100);
	        g.setFont(new Font("Consolas", Font.ROMAN_BASELINE, 36)); // 36-pt plain -> roman baseline
	        g.drawString("Yes, they are.", 400, 200);

	        g.setColor(Color.white);
	        g.setFont(new Font("Calibri", Font.HANGING_BASELINE, 60)); // 60-pt italic bold -> hanging baseline
	        g.drawString("Leander Lions", 300, 350);

	        g.setColor(Color.blue);
	        g.setFont(Font.decode("Calibri-BOLDITALIC-60")); // a different way to specify the same font
	        g.drawString("Leander Lions", 290, 360);
	        
	        g.setColor(Color.black);
	        g.setFont(new Font(null)); // restore default font

	        int x=300, y=390;
	        g.drawRect(x,y,250,40); //x1 moves the rec left/right. x2 extends the ends left/right.
	        						//y1 moves the rec up and down++. y2 extends the size verticalLy.
	        g.drawString("Where is the starting point?", x,y);
	        g.setColor(Color.red);
	        g.drawLine(x,y,x,y);	// drawing a line from a point to itself makes a 1px-by-1px dot

	    }

	    public static void main( String[] args )
	    {
	        JFrame win = new JFrame("GraphicsDemo3: Fonts and Lines");
	        win.setSize(800,600);
	        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        GraphicsDemo3 canvas = new GraphicsDemo3();
	        win.add( canvas );
	        win.setVisible(true);
	    }
	}
