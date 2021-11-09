package programbydoing;
import java.awt.*;
import javax.swing.JFrame;

public class GraphicsDemo1 extends Canvas
{
    public void paint( Graphics g )
    {
        g.setColor(Color.green);
        g.drawRect(100,150,250,50);  // draw a rectangle
        g.fillOval(30,45,20,35); // draw a filled-in oval
        g.setColor(Color.blue);
        g.fillRect(200,400,200,20); // a filled-in rectangle
        g.drawOval(200,430,200,100);
        g.setColor(Color.red);
        g.fillRect(550,330,175,170);
        
        g.setColor(Color.black);
        g.drawString("Graphics are pretty neat.", 500, 100);
        int x = getWidth() / 2;
        int y = getHeight() / 2;
        g.drawString("The first letter of this string is at (" + x + "," + y + ")", x, y);
    }

    public static void main( String[] args )
    {
        // You can change the title or size here if you want.
        JFrame win = new JFrame("GraphicsDemo1");  
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GraphicsDemo1 canvas = new GraphicsDemo1();
        win.add( canvas );
        win.setVisible(true);
   }
}



//1.The window is 800 pixels wide and 600 tall
//2.g.drawRect consist of four numbers. the vertical and horizontal size as well as where it sits on the x and y axis on the window
//3.g.drawOval first n is how it goes left/right on window, second n how much it goes up and down. third n vertical size. fourth n horizontal size
//4.The two numbers on the g.drawString are where the numbers sit on the x and y axis inside the window
//5.When two objects overlap, the filled in number wins.
//6.