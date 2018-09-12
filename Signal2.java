import java.awt.*;
import java.applet.*;
/*<applet code="Signal2" width="500" height="700">
</applet>
*/
public class Signal2 extends Applet implements Runnable
{
	Thread t=new Thread();
	public void init()
	{
	}
	public void start()
	{
		t.start();
	}
	public void run()
	{

		repaint();
	}
	public void paint(Graphics g)
	{	
		try
		{
			drawRectangles(g);
			drawRedCircle(g);
			Thread.sleep(500);
			g.setColor(Color.BLACK);
			g.fillOval(230,230,50,50);
			drawYellowCircle(g);
			Thread.sleep(700);
			g.setColor(Color.BLACK);
			g.fillOval(230,300,50,50);
			drawGreenCircle(g);
			Thread.sleep(900);
			g.setColor(Color.BLACK);
			g.fillOval(230,380,50,50);	
			repaint();
		}
		catch (InterruptedException e)
		{
		}
	}
	public void drawRedCircle(Graphics g)
	{
		g.setColor(Color.RED);
		g.fillOval(230,230,50,50);
	}
	public void drawYellowCircle(Graphics g)
	{
		g.setColor(Color.YELLOW);
		g.fillOval(230,300,50,50);
	}
	public void drawGreenCircle(Graphics g)
	{
		g.setColor(Color.GREEN);
		g.fillOval(230,380,50,50);
	}
	public void drawRectangles(Graphics g)
	{
		g.drawRoundRect(170,190,170,290,50,60);
	}

}














